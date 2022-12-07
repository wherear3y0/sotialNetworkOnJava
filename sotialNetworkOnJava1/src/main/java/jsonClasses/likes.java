package jsonClasses;

import com.google.gson.annotations.SerializedName;

public class likes {

    @SerializedName("id_posts")
    private int id_posts;
    @SerializedName("id_user")
    private int id_user;

    public likes(int id_post, int id_user){
        this.id_posts = id_post;
        this.id_user = id_user;
    }

    public int getId_post(){
        return id_posts;
    }

    public int getId_user(){
        return id_user;
    }

    @Override
    public String toString(){
        return "Root{" +
                "id_user='" + id_user + '\'' +
                "id_posts='" + id_posts + '\'' +
                '}';
    }
}
