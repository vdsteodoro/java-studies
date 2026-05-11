package com.github.vdsteodoro.lambda.services;

import com.github.vdsteodoro.lambda.domain.SteamUser;

public class UserComparators {
    public static int compareByUser(SteamUser a1, SteamUser a2){
        return a1.getNickName().compareTo(a2.getNickName());
    }
    public static int compareByNumberOfGames(SteamUser a1, SteamUser a2){
        return a1.getNumberOfGames().compareTo(a2.getNumberOfGames());
    }

    public int compareByUserNonStatic(SteamUser a1, SteamUser a2){
        return a1.getNumberOfGames().compareTo(a2.getNumberOfGames());
    }
}
