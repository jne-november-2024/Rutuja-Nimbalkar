package com.think.springboot.jpa_hibernate.junit;

public class MyMath {

    int[] num = {1, 2, 3};

    public int Sum(int[] num) {
        int sum = 0;
        for (int n : num) {
            sum += n;
        }
        return sum;
    }
}
