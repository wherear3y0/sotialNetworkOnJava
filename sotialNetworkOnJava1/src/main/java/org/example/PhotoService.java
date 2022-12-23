package org.example;

import Description.Friends;
import Description.Photo;

public class PhotoService {

    private PhotoStorage storage;

    PhotoService() {
        storage = new PhotoStorage();
    }

    public void addPhoto(int PhotoId, int MainPhotoId) {
        storage.addPhoto(new Photo(PhotoId, MainPhotoId));
    }

    public Photo getById(int id) {
        String s = "ID doesn't contain in storage";
        return storage.getById(id).orElseThrow();
    }

}
