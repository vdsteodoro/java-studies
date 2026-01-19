package com.github.vdsteodoro.utils.io;

import java.io.File;
import java.io.IOException;

public class FileTest22 {
    public static void main(String[] args) {

        File file = new File("file02.txt");

        try {
            boolean isCreate = file.createNewFile();
            System.out.println(isCreate ? "Arquivo criado" : "Arquivo não criado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
