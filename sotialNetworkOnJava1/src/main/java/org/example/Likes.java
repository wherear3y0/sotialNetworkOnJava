package org.example;

public class Likes {

    private boolean LikeCheck; // проверка стоит ли лайк

    private int LikeQuantity; // количество лайков

    // геттеры и сеттеры
    public boolean getLikeCheck(){
        return LikeCheck;
    }
    public void setLikeCheck(boolean LikeCheck){
        this.LikeCheck = LikeCheck;
    }

    public int getLikeQuantity(){
        return LikeQuantity;
    }
    public void setLikeQuantity(int LikeQuantity){
        this.LikeQuantity = LikeQuantity;
    }
}
