package com.tra.anemiadiagnosis;

public class SSS {
    private String title;
    private String genre;
    private int year;
    // State of the item
    private boolean expanded;

    public SSS(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

/*    public int getYear() {
        return year;
    }*/

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public boolean isExpanded() {
        return expanded;
    }
}
