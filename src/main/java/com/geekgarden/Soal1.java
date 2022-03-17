package com.geekgarden;


public class Soal1 {

    static void digitPattern(String input) {
        String cleanString = input.replaceAll("\\D+", "");
        int[] ar = Integer.toString(Integer.parseInt(cleanString)).chars().map(c -> c - '0').toArray();
        int i, x;
        for (i = 0; i < ar.length; i++) {
            x = ar[i];
            System.out.print(x);
            for (int j = 1; j < ar.length - i; j++) {
                System.out.print("0");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        digitPattern("9.86-A5.321");
    }


}
