package main;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long decimal = scanner.nextLong();

        String hex = Long.toHexString(decimal).toUpperCase();

        System.out.println("В 16 СС: "+hex);
        System.out.println("Теперь сделаем обратный перевод");

        String digits = "0123456789ABCDEF";

        int sum = 0;
        int value = 0;

        for(int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int digit = digits.indexOf(c);
            value = (int)(digit*Math.pow(16, hex.length()-(i+1)));
            sum += value;
        }
        System.out.println("В 10 СС: "+sum);
    }
}
