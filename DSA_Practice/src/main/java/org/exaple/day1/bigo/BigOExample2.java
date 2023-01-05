package org.exaple.day1.bigo;

public class BigOExample2 {
    public static void main(String...args) {
        int i,n=1000;
        long startTime = System.currentTimeMillis();
       // System.out.println(l);
        for(i=1;i<=n;i++) {
            for(int j=1;j<n;j++)
                System.out.println("Hello World--"+i);  //O(n*2);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time-Complexity---"+(endTime-startTime)/1000);
    }
}
