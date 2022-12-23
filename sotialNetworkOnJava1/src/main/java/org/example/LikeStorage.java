package org.example;

import Description.Likes;
import Description.Person;

import java.util.HashMap;
import java.util.Optional;

public class LikeStorage {

    private HashMap<Integer, Likes> likes;

    private int countId;

    LikeStorage(){
        this.likes = new HashMap<Integer, Likes>();
        this.countId = 1;
    }

    public void addLike(Likes like) {
        likes.put(countId++, like);
    }

    public Optional<Likes> getById(Integer id)  {
        return Optional.ofNullable(likes.get(id));
    }

}
