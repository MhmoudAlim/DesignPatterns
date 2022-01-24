package com.mahmoudalim.state;

public class Canvas {
    private Tool currentToll;


    public void setCurrentToll(Tool currentToll) {
        this.currentToll = currentToll;
    }

    public void mouseDown() {
        currentToll.mouseDown();
    }

    public void mouseUp() {
        currentToll.mouseUp();
    }

}
