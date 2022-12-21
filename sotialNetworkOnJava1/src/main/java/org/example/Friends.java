package org.example;

public class Friends {

    private String FriendName; //имя
    private String FriendLastName; //фамилия

    private int FriendAge; // возраст друга
    private int FriendFriends; // кол во друзей у друга
    private boolean OnlineCheck; // проверка онлайн ли друг

    //геттеры и сеттеры
    public String getFriendName(){
        return FriendName;
    }
    public void setFriendName(String FriendName){
        this.FriendName = FriendName;
    }

    public String getFriendLastName(){
        return FriendLastName;
    }
    public void setFriendLastName(String FriendLastName){
        this.FriendLastName = FriendLastName;
    }

    public int getFriendAge(){
        return FriendAge;
    }
    public void setFriendAge(int FriendAge){
        this.FriendAge = FriendAge;
    }

    public int getFriendFriends(){
        return FriendFriends;
    }
    public void setFriendFriends(int FriendFriends){
        this.FriendFriends = FriendFriends;
    }

    public boolean getOnlineCheck(){
        return OnlineCheck;
    }
    public void setOnlineCheck(boolean OnlineCheck){
        this.OnlineCheck = OnlineCheck;
    }
}
