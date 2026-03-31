package com.github.vdsteodoro.nestedclass;

public class OuterClassTest02 {
    private String name = "Brian";

    void print(final String param) {
        final String lastName = "O'conner";

        class LocalClass {
            public void printLocal() {
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }

        LocalClass local = new LocalClass();
        local.printLocal();
    }

    public static void main(String[] args) {
        OuterClassTest02 outer = new OuterClassTest02();
        outer.print("what is this??????????????");
    }
}
