package jsonClasses;

import com.google.gson.annotations.SerializedName;

public class friends {
    @SerializedName("name")
    private String name;
    @SerializedName("id")
    private int id;
    @SerializedName("likes")
    private int[] likes;
    @SerializedName("posts")
    private int[] posts;

    public friends(String name, int id, int[] likes, int[] posts){
        this.name = name;
        this.id = id;
        this.likes = likes;
        this.posts = posts;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public int[] getLikes(){
        return likes;
    }

    public int[] getPosts(){
        return posts;
    }

    @Override
    public String toString(){
        return "Root{" +
                "name='" + name + '\'' +
                "id='" + id + '\'' +
                "likes='" + likes + '\'' +
                "posts='" + posts + '\'' +
                '}';
    }

}
