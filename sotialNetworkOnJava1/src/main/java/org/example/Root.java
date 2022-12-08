package org.example;

import com.google.gson.annotations.SerializedName;
import jsonClasses.friends;
import jsonClasses.likes;
import jsonClasses.posts;

import java.util.List;

public class Root {
    @SerializedName("friends")
    private List<friends> Friends;
    @SerializedName("likes")
    private List<likes> Likes;
    @SerializedName("posts")
    private List<posts> Posts;


    public List<friends> getFriends(){
        return Friends;
    }

    public List<likes> getLikes(){
        return Likes;
    }

    public List<posts> getPosts(){
        return Posts;
    }


    public void setFriends(List<friends> Friends) {
        this.Friends = Friends;
    }

    public void setLikes(List<likes> Likes) {
        this.Likes = Likes;
    }

    public void setPosts(List<posts> Posts) {
        this.Posts = Posts;
    }


    @Override
    public String toString(){
        return "Root{" +
                ", friends=" + Friends +
                '}';
    }
}
