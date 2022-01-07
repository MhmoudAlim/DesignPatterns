package com.mahmoudalim;

import com.mahmoudalim.momento.Editor;
import com.mahmoudalim.momento.History;

public class Main {

    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("Mahmoud");
        history.push(editor.createState());

        editor.setContent("Hussein");
        history.push(editor.createState());

        editor.setContent("Alim");
        editor.restore(history.pop());

        System.out.println(editor.getContent());


    }
}
