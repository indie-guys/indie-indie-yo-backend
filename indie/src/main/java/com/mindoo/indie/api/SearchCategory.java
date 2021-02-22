package com.mindoo.indie.api;

public enum SearchCategory {
    ARTIST("artist"),
    ALBUM("album"),
    SONG("song");

    private String paramCategory;

    SearchCategory(String paramCategory) {
        this.paramCategory = paramCategory;
    }

    public String getParam(){
        return paramCategory;
    }
}
