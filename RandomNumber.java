
package edu.mta.demo;
import java.util.Scanner;
public class RandomNumber {

     public static void main(String[] args) {
         double a;
         a= Math.random()*7 + 5;// random tu 5 den 12
         System.out.println("Random number : " +a);
         
         double square= Math.sqrt(a);
         System.out.print("Square root : " +square);
    }
    
}
