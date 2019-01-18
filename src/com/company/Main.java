package com.company;

public class Main {

    public static void main(String[] args) {
        int finalNum = 1000; //stopping point
        int multA = 3;
        int multB = 5;
        int sum = 0;


        //loop starts at 1 and ends at finalNum (1000)
        for (int num = 1; num < finalNum; num++){
            //checks if num is evenly divisible by multA (3) and multB(5)
            if ((num%multA)==0 || (num%multB)==0) {
                sum += num; //if condition is met num is added to sum
            }
        }

        System.out.println(sum);

    }
}