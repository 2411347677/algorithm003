package com.my.recursion;

import java.util.Arrays;

public class RecursionTest {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,6,7,9,10,11,12};
        System.out.println(sum(a));
    }

    private static int sum(int[] a){
        if(a.length==1)
            return a[0];
        int b = a[0];
        a = Arrays.copyOfRange(a,1,a.length);
        return b+sum(a);
    }
}
