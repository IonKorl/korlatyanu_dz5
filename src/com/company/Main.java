package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int minDigit = 9;
        while (a != -1) {
            int firstDigit = a / 100;
            int promezhutochnoe = a / 10;
            int secondDigit = promezhutochnoe % 10;
            int thirdDigit = a % 10;
            if (firstDigit < minDigit){
                minDigit = firstDigit;
            }
            if (secondDigit < minDigit) {
                minDigit = firstDigit;
            }
            if (thirdDigit < minDigit) {
                minDigit = firstDigit;
            }
            a = scanner.nextInt();

        }
        System.out.println("Минимальная цифра из веденных данных равна" + minDigit);

    }
}
