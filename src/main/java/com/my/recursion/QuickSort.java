package com.my.recursion;

import org.apache.commons.lang.ArrayUtils;
import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {

        Integer[] a = new Integer[]{910,5,3,10,46,12,0,79};
        Integer[] b = quickSort(a);
        for(int i:b){
            System.out.println(i);
        }
    }

    /**
     * 快速排序算法
     * 1、选择基准值<br/>
     * 2、将数组分成两个子数组：小于基准值的元素和大于基准值的元素<br/>
     * 3、递归调用方法，对两个子数组排序
     * @param a
     * @return
     */
    private static Integer[] quickSort(Integer[] a){
        if(a.length<=1)
            return a;
        int pivot = a[0];
        List<Integer> less = new ArrayList<Integer>();
        List<Integer> greater = new ArrayList<Integer>();
        for(int i:a){
            if(i<a[0])
                less.add(i);
            if(i>a[0])
                greater.add(i);
        }
        less.add(a[0]);
        Integer[] b = less.toArray(new Integer[less.size()]);
        b = quickSort(b);
        Integer[] c = greater.toArray(new Integer[greater.size()]);
        c = quickSort(c);
        Integer[] d = (Integer[]) ArrayUtils.addAll(b,c);
        return d;
    }
}
