package com.mahmoudalim.momento;

import java.util.List;

public class History {
    public List<EditorState> getStates() {
        return states;
    }

    public void setStates(List<EditorState> states) {
        this.states = states;
    }

    private List<EditorState> states ;
}
