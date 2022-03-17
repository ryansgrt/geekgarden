package com.geekgarden;

import java.util.Arrays;

public class Soal3 {
    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 5, 7};
        int[] b = new int[]{3, 4, 8};
        int[] c = mergingArray(a, b);
        System.out.println(Arrays.toString(c));
    }

    public static int[] mergingArray(int[] a, int[] b) {

        int[] answer = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length)
            answer[k++] = a[i] < b[j] ? a[i++] : b[j++];

        while (i < a.length)
            answer[k++] = a[i++];

        while (j < b.length)
            answer[k++] = b[j++];

        return answer;
    }
}
