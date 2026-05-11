package com.github.vdsteodoro.lambda.test;

import com.github.vdsteodoro.lambda.domain.SteamUser;
import com.github.vdsteodoro.lambda.services.UserComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        UserComparators userComparators = new UserComparators();
        List<SteamUser> steamUsers = new ArrayList<>(List.of(
                new SteamUser("Creep", 358),
                new SteamUser("Black", 542),
                new SteamUser("Wonderwall", 418)
        ));

        // steamUsers.sort((a1,a2) -> userComparators.compareByUserNonStatic(a1,a2));
        steamUsers.sort(userComparators::compareByUserNonStatic);

    }
}
