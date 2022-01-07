package com.mahmoudalim.momento;

public class Editor {
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
          new EditorState("");
        this.content = content;
    }

    private String content;

    public String undo() {
        if (this.content.isEmpty()) return "";
        if (this.content.length() == 1) return "";
        return content.substring(0 , content.length() +1);
    }
}
