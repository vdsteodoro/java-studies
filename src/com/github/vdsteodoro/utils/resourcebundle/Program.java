package com.github.vdsteodoro.utils.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

// Verificar pasta de arquivos: Resource Bundle "messages" *****************************************************

public class Program {
    public static void main(String[] args) {

        ResourceBundle bundle1 = ResourceBundle.getBundle("messages", new Locale("en", "US"));

        System.out.println(bundle1.getString("hello"));
        System.out.println(bundle1.getString("good.morning"));

        ResourceBundle bundle2 = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));

        System.out.println(bundle2.getString("hello"));
        System.out.println(bundle2.getString("good.morning"));

    }
}
