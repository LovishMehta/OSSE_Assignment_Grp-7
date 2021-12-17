package com.DesignPatternsLearning.memento;

import java.util.ArrayList;

public class Editor2 {
    private String content;

    public EditorState createState(){

        return new EditorState(content);
    }

    public void restore(EditorState state){

        content = state.getContent();
    }

    public void setContent(String content){

        this.content = content;
    }
    public String getContent(){

        return content;
    }
}
