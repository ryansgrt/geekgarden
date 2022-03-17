package com.geekgarden;

import java.util.Arrays;

public class Soal2 {
    public static void main(String[] args) {
        int angka1 = 3;
        int angka2 = 7;
        int temp;
        temp = angka1;
        angka1 = angka2;
        angka2 = temp;

        System.out.println("Angka 1 :: " + angka1);
        System.out.println("Angka 2 :: " + angka2);
    }
}
