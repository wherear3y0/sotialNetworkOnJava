package org.example;

import Description.Photo;
import Interface.PhotoAction;

import java.util.HashMap;
import java.util.Optional;

public class PhotoStorage {

    private HashMap<Integer, Photo> photos;

    private int countId;

    PhotoStorage(){
        this.photos = new HashMap<Integer, Photo>();
        this.countId = 1;
    }

    public void addPhoto(Photo photo) {
        photos.put(countId++, photo);
    }

    public Optional<Photo> getById(Integer id)  {
        return Optional.ofNullable(photos.get(id));
    }
}
