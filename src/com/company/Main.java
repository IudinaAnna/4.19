package com.company;
import java.sql.Array;
import java.time.Year;
import java.util.Scanner;
class Customer {
    private double[] product;
    private int count_income;
    public Customer(){;}
    public double Count_income(double[] product, int count_income) {
        double sum=0;
        for(int i=0;i<count_income;i++) {
            sum+=product[i];
        }
        double result =sum*0.09;
        return result+200;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer customer=new Customer();
        System.out.print("количество проданных товаров: ");
        int count_income=input.nextInt();
        double [] product=new double[count_income];
        System.out.println("ценa проданных товаров: ");
        for(int i=0;i<count_income;i++) {
            System.out.print((i+1)+". ");
            product[i]=input.nextDouble();
        }
        System.out.print("доход: " + customer.Count_income(product,count_income));
    }
}
