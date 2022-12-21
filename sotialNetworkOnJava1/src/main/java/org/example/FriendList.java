package org.example;

public class FriendList {

    private int QuantityFriends; // количество друзей

    private String NameFriend; // Имя друга в списке

    private boolean FriendOnlineCheck; //проверка оналйна в списке


    //геттеры и сеттеры
    public int getQuantityFriends(){
        return QuantityFriends;
    }
    public void setQuantityFriends(int QuantityFriends){
        this.QuantityFriends = QuantityFriends;
    }

    public String getNameFriend(){
        return NameFriend;
    }
    public void setNameFriend(String NameFriend){
        this.NameFriend = NameFriend;
    }

    public boolean getFriendOnlineCheck(){
        return FriendOnlineCheck;
    }
    public void setFriendOnlineCheck(boolean FriendOnlineCheck){
        this.FriendOnlineCheck = FriendOnlineCheck;
    }
}
