package com.company;

public class Main {

    public static void main(String[] args) {
        int finalNum = 1000;
        int multA = 3;
        int multB = 5;
        int sum = 0;


        for (int num = 1; num < finalNum; num++){
            if ((num%multA)==0 || (num%multB)==0) {
                sum += num;
            }
        }

        System.out.println(sum);

    }
}