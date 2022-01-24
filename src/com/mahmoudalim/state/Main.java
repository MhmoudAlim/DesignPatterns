package com.mahmoudalim.state;

public class Main {

    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentToll(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

    }
}
