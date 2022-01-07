package com.mahmoudalim.momento;

public class EditorState {
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState(String content) {
        this.content = content;
    }

    private String content;
}
