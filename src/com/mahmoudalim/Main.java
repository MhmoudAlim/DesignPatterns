package com.mahmoudalim;

import com.mahmoudalim.momento.Editor;

public class Main {

    public static void main(String[] args) {
        var editor = new Editor();
        editor.setContent("a");
        System.out.println(editor.getContent());
        editor.setContent("b");
        System.out.println(editor.getContent());
        editor.setContent("cd");
        System.out.println(editor.getContent());
        editor.undo();
        System.out.println(editor.getContent());


    }
}
