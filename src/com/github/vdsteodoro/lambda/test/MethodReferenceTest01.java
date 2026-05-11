package com.github.vdsteodoro.lambda.test;

import com.github.vdsteodoro.lambda.domain.SteamUser;
import com.github.vdsteodoro.lambda.services.UserComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<SteamUser> users = new ArrayList<>(List.of(
                new SteamUser("RachtaZ", 64),
                new SteamUser("Alanzoka", 39),
                new SteamUser("Bistecone", 3)
        ));

        //Collections.sort(users, (a1,a2) -> a1.getNickName().compareTo(a2.getNickName()));

        Collections.sort(users, UserComparators::compareByUser);
        System.out.println(users);

        Collections.sort(users, UserComparators::compareByNumberOfGames);
        System.out.println(users);


    }
}
