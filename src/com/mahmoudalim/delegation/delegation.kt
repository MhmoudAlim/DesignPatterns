
class CountingSet(private val delegate: MutableSet<Long>) :
    MutableSet<Long> by delegate {

    private var addCount = 0L

    override fun add(element: Long): Boolean {
        addCount++
        return delegate.add(element)
    }

    override fun addAll(elements: Collection<Long>): Boolean {
        addCount += elements.size
        return delegate.addAll(elements)
    }
}

interface Base {
    fun printMe()
}

class BaseImpl(private val x: Int) : Base {
    override fun printMe() {
        println(x)
    }
}

class Derived(b: Base) : Base by b  // delegating the public method on the object b

fun main() {
    Derived(BaseImpl(3)).printMe()
    val x: CountingSet by lazy { CountingSet(HashSet()) }

    (1L..6L).forEach {
        x.add(it)
    }
    println(x.size.toString())

}