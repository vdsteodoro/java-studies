package com.github.vdsteodoro.lambda.test;

import com.github.vdsteodoro.lambda.domain.SteamUser;
import com.github.vdsteodoro.lambda.services.UserComparators;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<UserComparators> newSteamUSer = UserComparators::new;
        UserComparators userComparators = newSteamUSer.get();

        BiFunction<String, Integer, SteamUser> steamUserBiFunction = SteamUser::new;
        System.out.println(steamUserBiFunction.apply("Prison Mike", 39));

    }
}
