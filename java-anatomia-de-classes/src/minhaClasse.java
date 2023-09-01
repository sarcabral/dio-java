public class minhaClasse{
    public static void main (String [] args){
        // System.out.print("Hello World");

        //variavel alterada
        int ano = 2021;
        ano = 2022; 

        //variavel não pode ser alterada
        final String BR = "Brasil"; 

        String primeiroNome = "Sarah";
        String segundoNome = "Cabral";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}