package com.github.vdsteodoro.lambda.domain;

public class SteamUser {
    private String nickName;
    private Integer numberOfGames;

    public SteamUser(String nickName, Integer numberOfGames) {
        this.nickName = nickName;
        this.numberOfGames = numberOfGames;
    }

    @Override
    public String toString() {
        return "Steam{" +
                "NickName='" + nickName + '\'' +
                ", numberOfGames=" + numberOfGames +
                '}';
    }

    public String getNickName() {
        return nickName;
    }

    public Integer getNumberOfGames() {
        return numberOfGames;
    }
}
