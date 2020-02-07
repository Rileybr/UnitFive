/**
 * @author Brandon Riley
 * @somce February 7 2020
 * creates a fraction and does simple mathematical functions with fractions
 */
package com.company;

public class Fraction {
    private int numerator;
    private int denominator;

    /**
     * figures out what the lcm of numerator and denominator is
     * @param m numerator
     * @param n denominator
     * @return LCM of numerator and denominator
     */
    private static int reduce(int m, int n) {
        while (m % n != 0) {
            int oldm = m;
            int oldn = n;

            m = oldn;
            n = oldm % oldn;
        }
        return n;
    }

    /**
     * creates a fraction object with a numerator and denominator and simplifies it
     * @param num numerator of fraction
     * @param den denominator of fraction
     */
    public Fraction(int num, int den){
        numerator = num;
        denominator = den;

        if (denominator < 0){
            denominator = -denominator;
            numerator = -numerator;
        }

        int temp = reduce(numerator, denominator);
        numerator /= temp;
        denominator /= temp;
    }

    /**
     * creates a 1/1 fraction
     */
    public Fraction(){
        this(1,1);
    }

    /**
     * adds two fractions together
     * @param a fraction 1
     * @param b fraction 2
     * @return the sum of fraction 1 and fraction 2
     */
    public static Fraction add(Fraction a, Fraction b){
        int new_denominator = a.denominator * b.denominator;
        int new_numerator = (a.numerator * b.denominator) + (b.numerator * a.denominator);

        return new Fraction(new_numerator, new_denominator);
    }

    /**
     * subtracts two fractions
     * @param a fraction 1
     * @param b fraction 2
     * @return the difference of fraction 1 and fraction 2
     */
    public static Fraction subtract(Fraction a, Fraction b){
        int new_denominator = a.denominator * b.denominator;
        int new_numerator = (a.numerator * b.denominator) - (b.numerator * a.denominator);

        return new Fraction(new_numerator, new_denominator);
    }

    /**
     * multiplies two fractions together
     * @param a fraction 1
     * @param b fraction 2
     * @return product of fraction 1 and fraction 2
     */
    public static Fraction multiply(Fraction a, Fraction b){
        int new_denominator = a.denominator * b.denominator;
        int new_numerator = a.numerator * b.numerator;

        return new Fraction(new_numerator, new_denominator);
    }

    /**
     * divides two fractions
     * @param a fraction 1
     * @param b fraction 2
     * @return quotient of fraction 1 and fraction 2
     */
    public static Fraction divide(Fraction a, Fraction b){
        int x = b.denominator;
        b.denominator = b.numerator;
        b.numerator = x;

        int new_denominator = a.denominator * b.denominator;
        int new_numerator = a.numerator * b.numerator;

        return new Fraction(new_numerator, new_denominator);
    }

    /**
     * returns the numerator over the denominator in it's simplest form
     * @return the numerator over the denominator in it's simplest form
     */
    public String toString(){
        if (denominator < 0){
            denominator = -denominator;
            numerator = -numerator;
        }
        return numerator+"/"+denominator;
    }



}
