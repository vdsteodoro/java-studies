package com.github.vdsteodoro.utils.scanner.tokensdelimitadores;

public class Program {
    public static void main(String[] args) {

        /*
        Token: cada pedaço de texto extraído pelo Scanner após a divisão.
        Delimitador: o padrão (regex) usado pelo Scanner para separar os tokens.
        */

        String emails = "rxpvin.ii@gmail.com, rxp.gsw@gmail.com, icxc.vs@gmail.com";

        //Sem Scanner
        String[] split = emails.split(",");

        for (String var : split){
            System.out.println(var.trim());
        }


    }
}
