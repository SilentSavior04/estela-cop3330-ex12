package com.company;
import java.util.Scanner;

public class DetermineCompoundInterest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Principle Amount");
        int p = sc.nextInt();
        System.out.println("Compound Rate");
        float r = sc.nextFloat();
        System.out.println("Number of Years");
        int t = sc.nextInt();
        System.out.println("Number of times the interest is compounded per year");
        int n = sc.nextInt();
        //int t1= n*t;
        double a = (double) p * (Math.pow((1 + r/n), n*t));
        System.out.println("$" + p + " invested at " +r+"% for " +t+ " years compounded " +n+ " times per year is" + "$" + a);
    }
}
