package com.mahmoudalim.momento;

public record EditorState(String content) {
    public String getContent() {
        return content;
    }

}
