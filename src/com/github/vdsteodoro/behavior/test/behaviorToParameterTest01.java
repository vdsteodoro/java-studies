package com.github.vdsteodoro.behavior.test;

import com.github.vdsteodoro.behavior.domain.FunkoPop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class behaviorToParameterTest01 {
    static List<FunkoPop> funkoPops = new ArrayList<>(List.of(
            new FunkoPop("Harry Potter", "Sirius Black", 149.60),
            new FunkoPop("The Office", "Michael Scott", 199.90),
            new FunkoPop("Friends", "Chandler", 99.00),
            new FunkoPop("Harry Potter", "Snape", 151.90),
            new FunkoPop("The Office", "Jim", 126.78),
            new FunkoPop("Friends", "Monica", 108.72)));

    public static void main(String[] args) {
        List<FunkoPop> filterChars = filter(funkoPops, new Predicate<FunkoPop>() {
            @Override
            public boolean test(FunkoPop funkoPop) {
                return funkoPop.getFranchise().equals("The Office");
            }
        });
        for (FunkoPop fp : filterChars){
            System.out.println(fp);
        }

        List<FunkoPop> filterWithLambda = filter(funkoPops, fp -> fp.getFranchise().equals("Harry Potter"));

        for (FunkoPop fp : filterWithLambda){
            System.out.println(fp);
        }

    }

    private static <T> List<T> filter(List<T> t, Predicate<T> predicate) {
        List<T> tList = new ArrayList<>();

        for (T temp : t) {
            if (predicate.test(temp)) {
                tList.add(temp);
            }
        }
        return tList;
    }

}
