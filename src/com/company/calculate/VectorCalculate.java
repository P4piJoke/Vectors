package com.company.calculate;

import java.util.Random;

public class VectorCalculate {

    public double VectorLength (double x, double y, double z){
        double  longitude;
        longitude = Math.sqrt(x*x+y*y+z*z);
        return longitude;
    }

    public double ScalarProduct(double x1, double y1, double z1, double x2, double y2, double z2){
        double product;
        product =x1*x2+y1*y2+z1*z2;
        return product;
    }
    public void VectorProduct(double x1, double y1, double z1, double x2, double y2, double z2){
        System.out.println("("+(y1*z2-z1*y2)+","+(z1*x2-x1*z2)+","+(x1*y2-y1*x2)+")");
    }

    public double AngleBetweenVectors(double a1, double a2,double a3, double b1,double b2, double b3){
        double angle;
        angle = ScalarProduct(a1,a2,a3,b1,b2,b3)/(Math.abs(VectorLength(a1,a2,a3))*Math.abs(VectorLength(b1,b2,b3)));
        return angle;
    }

    public void SumOfVectors (double x1, double y1, double z1, double x2, double y2, double z2){
        System.out.println("("+(x1+x2)+","+(y1+y2)+","+(z1+z2)+")");
    }

    public void DifferenceVectors (double x1, double y1, double z1, double x2, double y2, double z2){
        System.out.println("("+(x1-x2)+","+(y1-y2)+","+(z1-z2)+")");
    }

    public static void RandomMas (int N){
        Random random = new Random();
        for (int i = 0; i <N ; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(random.nextDouble()+" ");
            }
            System.out.println();
        }
    }
}
