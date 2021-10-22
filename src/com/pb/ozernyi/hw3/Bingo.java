package com.pb.ozernyi.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int guess = r.nextInt (100) +1;
        int attempt = 0;
        while (true) {
            attempt++;
            System.out.println ("Введите число, которое мы загадали (от 0 до 100). Если хотите завершить игру введите 00");
            int input = sc.nextInt();
            if (input == 00) {
                break;
            } else if (input > guess) {
                System.out.println ("Загаданное число меньше");
            } else if (input < guess) {
                System.out.println ("Загаданное число больше");
            } else if (input == guess){
                System.out.println ("BINGO!!! Вы угадали с "+ attempt +" попытки!");
                break;
            }
        }
        System.out.println ("Игра окончена");

    }
}


