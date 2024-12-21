package com.driver;

public class Main {

    // Task 1: Create a class Product inside Main class
    public static class Product {

        // Task 3: Method with two integer parameters
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method with three integer parameters
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method with two double parameters
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create an object of Product class
        Product p = new Product();

        // Calling the methods and printing the results
        System.out.println(p.product(10, 20));            // Calls the first method -> Output: 200
        System.out.println(p.product(2, 3, 4));           // Calls the second method -> Output: 24
        System.out.println(p.product(5.5, 4.5));          // Calls the third method -> Output: 24.75
    }
}