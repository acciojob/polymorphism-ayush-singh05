package com.driver;

public class Main {

    public static void main(String[] args) {
        Product obj = new Product();
        int pro = obj.product(2,5);
        System.out.println(pro);

        int pro2 = obj.product(5,6,7);
        System.out.println(pro2);

        double pro3 = obj.product(2.5,4.4);
        System.out.println(pro3);

    }
}
class Product {
    public int product(int x, int y) {

        return x*y;
    }
    public int product(int x, int y, int z) {
        return x*y*z;
    }
    public double product(double x, double y) {
        return x*y;
    }
}