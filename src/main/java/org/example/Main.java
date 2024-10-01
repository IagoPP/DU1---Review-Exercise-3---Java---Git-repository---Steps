package org.example;

import java.util.Scanner;

/**
 * Main class
 * */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rounds = sc.nextInt();

        for (int i = 0; i < rounds; i++) {
            int steps = sc.nextInt();
            int jump = sc.nextInt();

            if (steps%jump==0){
                System.out.println(steps/jump);
            }else{
                System.out.println(steps/jump+1);
            }
        }
    }
}