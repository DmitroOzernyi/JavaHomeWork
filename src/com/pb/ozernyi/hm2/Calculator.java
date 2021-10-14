package com.pb.ozernyi.hm2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        char sign;
        int result;
        System.out.println("Введите первое число:");
        operand1 = scan.nextInt();
        System.out.println("Введите второе число:");
        operand2 = scan.nextInt();
        System.out.println("Введите оператор (+,-,*,/):");
        sign = scan.next().charAt(0);
        switch (sign) {
            case '+': result = operand1 + operand2;
                break;
            case '-': result = operand1 - operand2;
                break;
            case '*': result = operand1 * operand2;
                break;
            case '/': if (operand2 == 0) {
                System.out.println("Делить на 0 нельзя");
            }
                result = operand1 / operand2;
                            break;
            default:  System.out.println("Введите корректный оператор");
                return;
        }
        System.out.println( operand1 + " " + sign + " " + operand2 + " = " + result);
    }
}
