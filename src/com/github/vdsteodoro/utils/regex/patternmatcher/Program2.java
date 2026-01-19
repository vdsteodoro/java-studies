package com.github.vdsteodoro.utils.regex.patternmatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program2 {
    public static void main(String[] args) {
        /* ***** Meta caracteres

        \d      = qualquer dígito (0–9)
        \D      = qualquer caractere que NÃO seja dígito
        \s      = espaço em branco (espaço, tab, quebra de linha)
        \S      = qualquer caractere que NÃO seja espaço em branco
        \w      = letra (a–z, A–Z), dígito ou _
        \W      = qualquer caractere que NÃO seja letra, dígito ou _
        []      = conjunto/range de caracteres
        ?       = zero ou uma vez
        *       = zero ou mais vezes
        +       = uma ou mais vezes
        {n,m}   = de n até m vezes
        ()      = grupo
        |       = OU lógico
        $       = fim da linha
        .       = qualquer caractere (exceto quebra de linha)

        */

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail";

        System.out.println("Email valido");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
