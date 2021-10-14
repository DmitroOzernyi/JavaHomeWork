package com.pb.ozernyi.hm2.Interval;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Введите любое целое чиcло");
        x = scan.nextInt();
        if (x >= 0 && x <= 14 ) {
            System.out.println("Это число в диапазоне [0-14]");
        }
            if (x >= 15 && x <= 35) {

                System.out.println ("Это число в диапазоне [15-35]");
            }
                    if (x >= 36 && x <= 50) {

                        System.out.println ("Это число в диапазоне [36-50]");
                    }
                            if (x >= 51 && x <= 100) {

                                System.out.println ("Это число в диапазоне [51-100]");
                            }
                                if (x > 100) {

                                    System.out.println ("Это число за пределами диапазона [0-100]");
                                }
        }
    }


