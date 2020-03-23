package com.my.recursion;

import org.apache.commons.lang.ArrayUtils;
import sun.security.util.ArrayUtil;

import java.lang.reflect.Array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] a = new int[]{0,1,2,3};
        int[] b = new int[]{4,5,6};
        int[] c = ArrayUtils.addAll(a,b);
        for(int i:c){
            System.out.println(i);
        }
    }
}
