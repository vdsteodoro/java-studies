package com.github.vdsteodoro.utils.io;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {

        /* Alguns metodos em file
        file.createNewFile() → cria um arquivo vazio (retorna false se já existir)
        file.exists() → verifica se o arquivo ou diretório existe
        file.delete() → apaga o arquivo ou diretório
        file.isFile() → verifica se é um arquivo (e não pasta)
        file.isDirectory() → verifica se é um diretório
        file.getName() → retorna o nome do arquivo
        file.getPath() → retorna o caminho informado na criação
        file.getAbsolutePath() → retorna o caminho absoluto
        file.length() → retorna o tamanho do arquivo (em bytes)
        file.canRead() → verifica se pode ser lido
        file.canWrite() → verifica se pode ser escrito
        file.list() → lista nomes dos arquivos dentro do diretório
        file.listFiles() → lista arquivos como objetos File
        file.mkdir() → cria um diretório
        file.mkdirs() → cria diretório e pais necessários
         */

        File file = new File("file.txt");

        try {
            boolean isCreate = file.createNewFile();
            System.out.println(isCreate ? "Arquivo criado" : "Arquivo não criado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
