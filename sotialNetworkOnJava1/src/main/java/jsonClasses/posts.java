package jsonClasses;

import com.google.gson.annotations.SerializedName;

public class posts {

    @SerializedName("id")
    private int id;
    @SerializedName("title")
    private String title;
    @SerializedName("desc")
    private String desc;

    public posts(int id, String title, String desc){
        this.id = id;
        this.title = title;
        this.desc = desc;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getDesc(){
        return desc;
    }

    @Override
    public String toString(){
        return "Root{" +
                "id='" + id + '\'' +
                "title='" + title + '\'' +
                "desc='" + desc + '\'' +
                '}';
    }


}
