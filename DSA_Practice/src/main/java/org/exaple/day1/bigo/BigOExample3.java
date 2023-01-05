package org.exaple.day1.bigo;

public class BigOExample3 {
    public static void main (String...args) {
        int n=10;
        for(int i=1;i<n;i=i*2) {
            System.out.println("Hello World---"+i); //O(logn)
        }
    }
}
