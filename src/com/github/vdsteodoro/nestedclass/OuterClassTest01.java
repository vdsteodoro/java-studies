package com.github.vdsteodoro.nestedclass;

public class OuterClassTest01 {
    private String name = "Ygritte";

    class Inner{
        public void printMySelf(){
            System.out.println("You're in");
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        OuterClassTest01 outerClassTest01 = new OuterClassTest01();
        Inner inner = outerClassTest01.new Inner();


        inner.printMySelf();
    }
}
