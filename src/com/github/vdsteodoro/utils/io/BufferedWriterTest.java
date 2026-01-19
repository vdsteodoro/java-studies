package com.github.vdsteodoro.utils.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterTest {
    public static void main(String[] args) {
        File file = new File("file.txt");

        Scanner sc = new Scanner(System.in);

        String quest = sc.nextLine();

        try (FileWriter fw = new FileWriter(file, true)) {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(quest);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        sc.close();

    }
}
