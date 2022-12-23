package Description;

public class Friends {

    private String FriendName; //имя
    private int FriendAge; // возраст друга
    private boolean OnlineCheck; // проверка онлайн ли друг

    public Friends(String friendName, int friendAge, boolean onlineCheck) {
        FriendName = friendName;
        FriendAge = friendAge;
        OnlineCheck = onlineCheck;
    }

    //геттеры и сеттеры
    public String getFriendName(){
        return FriendName;
    }
    public void setFriendName(String FriendName){
        this.FriendName = FriendName;
    }


    public int getFriendAge(){
        return FriendAge;
    }
    public void setFriendAge(int FriendAge){
        this.FriendAge = FriendAge;
    }

    public boolean getOnlineCheck(){
        return OnlineCheck;
    }
    public void setOnlineCheck(boolean OnlineCheck){
        this.OnlineCheck = OnlineCheck;
    }
}
