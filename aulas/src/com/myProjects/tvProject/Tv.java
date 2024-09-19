package com.myProjects.tvProject;

import java.util.Scanner;

public class Tv {
    public static void main(String[] args) {

        Controller control = new Controller();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Deseja ligar a televisão? [1] Sim / [2] Não");
        int ligarTv = leitor.nextInt();

        while (ligarTv == 1) {

            control.turnOn = true;

            System.out.println("[1]Desligar ");
            System.out.println("[2]Canal: " + control.channel);
            System.out.println("[3]Volume: " + control.audio);
            System.out.println("[4](des)Mutar: " + control.checkMute);

            System.out.println("Deseja alterar algum estado?");
            int op = leitor.nextInt();

            switch (op) {
                case 1:
                    control.statusTv();
                    break;

                case 2:
                    control.changeChannel();
                    break;

                case 3:
                    control.changeAudio();
                    break;
                case 4:
                    control.mute();
                    break;

            }

            if (!control.turnOn)
                break;
        }
    }
}
