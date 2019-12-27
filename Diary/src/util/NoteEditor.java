package util;

import entity.Note;

public class NoteEditor {
    private String name;
    private String content;
    private String[] changeHistory;
    private Note note;

    public NoteEditor(String name, String content, String[] changeHistory, Note note) {
        this.name = name;
        this.content = content;
        this.changeHistory = changeHistory;
        this.note = note;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String[] getChangeHistory() {
        return changeHistory;
    }

    public void setChangeHistory(String[] changeHistory) {
        this.changeHistory = changeHistory;
    }
    public void loadNote(String title, String arg){

    }

    public void rename(String name){
        this.name=name;
    }

    public void revertChange(){

    }

    public void returnChange(){}
}
