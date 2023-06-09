package com.driver;

public class Main {
    static class Product {
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
    public static void main(String[] args) {
        Product p = new Product();
        int pro = p.product(2,5);
        System.out.println(pro);

        int pro2 = p.product(5,6,7);
        System.out.println(pro2);

        double pro3 = p.product(2.5,4.4);
        System.out.println(pro3);

    }
}
