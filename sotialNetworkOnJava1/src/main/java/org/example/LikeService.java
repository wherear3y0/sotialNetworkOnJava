package org.example;

import Description.Likes;
import Description.Person;

public class LikeService {
    private LikeStorage storage;

    LikeService() {
        storage = new LikeStorage();
    }

    public void addLike(int likeIdPerson, int likerIdPerson) {
        storage.addLike(new Likes(likeIdPerson, likerIdPerson));
    }

    public Likes getById(int id) {
        String s = "ID doesn't contain in storage";
        return storage.getById(id).orElseThrow();
    }
}
