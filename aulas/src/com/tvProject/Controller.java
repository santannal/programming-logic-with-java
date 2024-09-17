package com.tvProject;

import java.util.Scanner;

public class Controller {
    boolean turnOn = false;
    int channel = 1;
    int audio = 0;
    int getAudio = audio;
    boolean checkMute = false;

    Scanner leitor = new Scanner(System.in);

    public void statusTv() {
        if (turnOn == false)
            turnOn = true;
        else
            turnOn = false;
    }

    public void changeChannel() {
        do {
            System.out.println("Digite o canal desejado [1 à 100]: ");
            channel = leitor.nextInt();
        } while (channel > 100 || channel < 1);
    }

    public void changeAudio() {
        do {
            System.err.println("Digite qual será o novo volume: ");
            audio = leitor.nextInt();
        } while (audio > 100 || audio < 1);
    }

    public void mute() {
        if (!checkMute) {
            checkMute = true;
            getAudio = audio;
            audio = 0;
        } else {
            checkMute = false;
            audio = getAudio;
        }
    }
}
