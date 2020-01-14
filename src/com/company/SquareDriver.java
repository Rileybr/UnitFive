package com.company;

import java.util.Scanner;

public class SquareDriver {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Side Length: ");
        Square square = new Square(scanner.nextDouble());
        System.out.println(square.calculateArea());
        System.out.println(square);
    }
}
