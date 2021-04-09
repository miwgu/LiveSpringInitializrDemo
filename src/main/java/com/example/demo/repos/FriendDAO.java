package com.example.demo.repos;

import com.example.demo.models.Friend;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Miwa Guhrés
 * Date: 2021-04-08
 * Time: 14:50
 * Project: LiveSpringInitializrDemo
 * Copyright: MIT
 */
public class FriendDAO {
    public  List<Friend> getAllFriends(){
        Friend f1 = new Friend(1,"Midori","alvägen 1","1111111111");
        Friend f2 = new Friend(2,"Makiko","mitakanomori 2","2222222222");
        Friend f3 = new Friend(3,"Mika","osaka 3","3333333333");
        Friend f4 = new Friend(4,"Reiko","takatsuki 4","4444444444");
        Friend f5 = new Friend(5,"Chiyo","nakagyo-ku 2","5555555555");

        List<Friend> lista =new LinkedList<>();
        lista.add(f1);
        lista.add(f2);
        lista.add(f3);
        lista.add(f4);
        lista.add(f5);
        return lista;
        // Array fungerade inte (det finns inte support.)
        // return Arrays.asList(f1,f2,f3,f4,f5);
    }
}
