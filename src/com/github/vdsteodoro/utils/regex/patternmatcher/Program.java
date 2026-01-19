package com.github.vdsteodoro.utils.regex.patternmatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {
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

        String regex = "\\W";
        String text = "abcgdt23_$";


        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(text);

        System.out.println("Positions regex found:");

        while (matcher.find()) {
            System.out.print("P" + matcher.start() + ": " + matcher.group() + "\n");
        }
    }
}
