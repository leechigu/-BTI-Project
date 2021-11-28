package com.example.catbti;

public class FunComment {
    private int fcommentNum;
    private int fcommentPostNum;
    private String fcommentObj;
    private String fcommentMbti;

    public FunComment(){
    }
    public int getCommentNum() {
        return fcommentNum;
    }
    public void setCommentNum(int commentNum) {
        this.fcommentNum = commentNum;
    }

    public int getPostCommentNum() {
        return fcommentPostNum;
    }
    public void setPostCommentNum(int commentPostNum) {
        this.fcommentPostNum = commentPostNum;
    }


    public String getFCommentMbti() {
        return fcommentMbti;
    }
    public void setFCommentMbti(String commentMbti) {
        this.fcommentMbti = commentMbti;
    }

    public String getCommentObj(){return fcommentObj; }
    public void setCommentObj(String commentObj){this.fcommentObj = commentObj;}



}
