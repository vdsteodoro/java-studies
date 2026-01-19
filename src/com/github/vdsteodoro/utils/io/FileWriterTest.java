package com.github.vdsteodoro.utils.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        File file = new File("newFile.txt");

        /* Ao executar o programa, o FileWriter sobrescreve o conteúdo do arquivo por padrão.
        Para manter o conteúdo existente e apenas adicionar novos dados, é necessário usar o construtor com append = true, por exemplo:
        new FileWriter(file, true).
         */

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("Uma frase no arquivo\n");
            fileWriter.write("Nova frase no arquivo");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
