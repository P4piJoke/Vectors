package com.company;

import com.company.calculate.VectorCalculate;

public class Main {
    public static void main(String[] args) {
        VectorCalculate vektor = new VectorCalculate();
        System.out.println(vektor.VectorLength(4,-1,3));
        System.out.println(vektor.AngleBetweenVectors(2,3,5,6,1,7));
        new VectorCalculate().RandomMas(5);
    }
}
