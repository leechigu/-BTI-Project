package com.example.catbti;

public class FunPost {
    private int postNum;
    private String title;
    private String content;
    private String obj1;
    private String obj2;
    public FunPost(){

    }

    public int getPostNum() {
        return postNum;
    }

    public void setPostNum(int postNum) {
        this.postNum = postNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return content;
    }

    public void setContents(String content) {
        this.content = content;
    }

    public void setObj1(String obj1){this.obj1 = obj1;}
    public String getObj1(){return obj1;}
    public void setObj2(String obj2) {
        this.obj2 = obj2;
    }
    public String getObj2(){return obj2;}

}
