package com.example.demo.controllers;
// CRUD = create, read,update,delete

import com.example.demo.models.Friend;
import com.example.demo.models.Message;
import com.example.demo.repos.FriendDAO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Miwa Guhrés
 * Date: 2021-04-08
 * Time: 15:05
 * Project: LiveSpringInitializrDemo
 * Copyright: MIT
 */

@RestController
public class FriendController {
    FriendDAO db = new FriendDAO();
    List<Friend> myFriends = db.getAllFriends();

    @RequestMapping("/friends")
    public List<Friend> friends() {
        return myFriends;
    }

    @RequestMapping("/friend/{id}")
    public Friend FriendById(@PathVariable int id) {
        for (Friend f : myFriends) {
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }

    @RequestMapping("/friend/{id}/delete")
    public String deleteFriendById(@PathVariable int id) {
        int friendToRemove = -1;// id 1= index 0 i list
        /*for (Friend f : myFriends) {
            if (f.getId() == id) {
                bookToRemove = f.getId();
            }
        }*/
        for (int i = 0; i < myFriends.size(); i++) {
            if (myFriends.get(i).getId() == id) {
                friendToRemove = i;
            }
        }
        System.out.println("friendToRemove " + friendToRemove + " length " + myFriends.size());
        myFriends.remove(friendToRemove);
        return "Friend med id " + id + " är borttagen";

    }

    @PostMapping("/friend/add")
    public String addFriend(@RequestBody Friend f) {
        myFriends.add(f);
        return "friend added";
    }

    @PostMapping("/friend/upsert")
    public Message upsertFriend(@RequestBody Friend f) {
        int indexToUpdate = -1;

        for (int i = 0; i < myFriends.size(); i++) {
            if (myFriends.get(i).getId() == f.getId()) {
                indexToUpdate = i;
            }
        }
        if (indexToUpdate == -1) {
            myFriends.add(f);
            Message m = new Message(true, "New friend was created");
            return m;
        } else {
            myFriends.set(indexToUpdate, f);
            Message m = new Message(true, "The friend was updated");
            return m;
        }
    }
}
