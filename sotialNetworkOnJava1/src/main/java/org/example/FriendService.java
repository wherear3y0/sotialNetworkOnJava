package org.example;

import Description.Friends;

public class FriendService {

    private FriendStorage storage;

    FriendService() {
        storage = new FriendStorage();
    }

    public void addFriend(String FriendName, int FriendAge, boolean OnlineCheck) {
        storage.addFriend(new Friends(FriendName, FriendAge, OnlineCheck));
    }

    public Friends getById(int id) {
        String s = "ID doesn't contain in storage";
        return storage.getById(id).orElseThrow();
    }
}
