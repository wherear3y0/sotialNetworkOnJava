package Description;

public class Likes {

    private int likeIdPerson;// проверка стоит ли лайк
    private int likerIdPerson; // количество лайков


    public Likes(int likeIdPerson, int likerIdPerson) {
        this.likeIdPerson = likeIdPerson;
        this.likerIdPerson = likerIdPerson;
    }

    // геттеры и сеттеры
    public int getlikeIdPerson(){
        return likeIdPerson;
    }
    public void setlikeIdPerson( int LikeCheck){
        this.likeIdPerson = LikeCheck;
    }

    public int getlikerIdPerson(){
        return likerIdPerson;
    }
    public void setLikerIdPerson(int likerIdPerson){
        this.likerIdPerson = likerIdPerson;
    }
}
