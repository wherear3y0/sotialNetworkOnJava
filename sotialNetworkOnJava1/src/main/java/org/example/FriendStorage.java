package org.example;

import Description.Friends;

import java.util.HashMap;
import java.util.Optional;

public class FriendStorage {

    private HashMap<Integer, Friends> friends;

    private int countId;

    FriendStorage(){
        this.friends = new HashMap<Integer, Friends>();
        this.countId = 1;
    }

    public void addFriend(Friends friend) {
        friends.put(countId++, friend);
    }

    public Optional<Friends> getById(Integer id)  {
        return Optional.ofNullable(friends.get(id));
    }
}
