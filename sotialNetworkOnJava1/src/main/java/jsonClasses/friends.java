package jsonClasses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class friends {
    @SerializedName("name")
    private String name;
    @SerializedName("id")
    private int id;
    @SerializedName("likes")
    private List<Integer> likes;
    @SerializedName("posts")
    private List<Integer> posts;


}
