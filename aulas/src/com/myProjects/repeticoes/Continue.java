package com.myProjects.repeticoes;

public class Continue {
    //ele muda o fluxo, não printando o numero 3
    public static void main(String[] args) {
        for(int i = 0; i < 6; ++i){
            if(i == 3)
                continue;
            System.err.println(i);
        }
    }
}
