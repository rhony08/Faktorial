package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        int start = 2;
        int x = scanner.nextInt();
        for (int i = x-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) System.out.print("O");
            for (int j = 0; j < start; j++) System.out.print("*");
            for (int j = 0; j < i; j++) System.out.print("O");
            System.out.println();
            if (i != 0) start+=2;
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) System.out.print("O");
            for (int j = 0; j < start; j++) System.out.print("*");
            for (int j = 0; j < i; j++) System.out.print("O");
            System.out.println();
            start-=2;
        }
    }
}
