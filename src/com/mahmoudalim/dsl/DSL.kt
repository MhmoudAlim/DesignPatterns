import javax.swing.tree.TreeNode

data class Car(
    var color: String = "",
    var imageResource: Int = 0
)

fun car(block: Car.() -> Unit): Car {
    val car = Car()
    return car.apply(block)
}


fun main() {
    val redCar = car {
        color = "Red"
        imageResource = 1
    }
    println(redCar.color)
}

class CarBuilder {
    var color: String = "blue"
    var imageResourceId: Int = 0

    fun build(): Car = Car(color, imageResourceId)
}

class Cars : ArrayList<Car>() {
    fun car(carBuilder: CarBuilder.() -> Unit) {
        add(CarBuilder().apply(carBuilder).build())
    }
}

inline fun <reified T> TreeNode.findParentOfType(): T? {
    var p = parent
    while (p != null && p !is T) {
        p = p.parent
    }
    return p as T?
}