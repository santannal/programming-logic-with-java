package com.myProjects.Exceptions;

public class CepExample {
    public static void main(String[] args) {
        try {
            String cep = formatarCep("23765064");
            System.out.println(cep);
        } catch (InvalidCep e) {
            System.out.println("Cep incorreto!");
        }
    }

    static String formatarCep(String cep) throws InvalidCep {
        if (cep.length() != 8)
            throw new InvalidCep();

        return "23.765-064";
    }
}
