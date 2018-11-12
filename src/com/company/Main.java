package com.company;

import java.util.Scanner;

class Numere {
    private int[] numereCitite = new int[6];
    private Scanner nou = new Scanner(System.in);

    public Numere() {
        for(int i = 0; i < numereCitite.length; i++) {
            numereCitite[i] = nou.nextInt();
        }
    }

    public void afisare(){
        for(int i = 0; i < numereCitite.length; i++)
            System.out.println("numereCitite[" + i + "] = " + numereCitite[i]);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Numere n = new Numere();
        n.afisare();
    }
}
