/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.demir.product;

public class App {
    public void displayProduct() {
        Product newProduct = new Product("pencil", "gray", 5.00);
        System.out.println(newProduct);
    }

    public static void main(String[] args) {
        new App().displayProduct();
    }
}