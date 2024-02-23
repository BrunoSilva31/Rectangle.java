package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.println("Enter rectangle height: ");
        rect.height = sc.nextDouble();

        System.out.println("Enter rectangle width: ");
        rect.width = sc.nextDouble();

        System.out.println();
        System.out.printf("Rectangle AREA is: %.2f", rect.area());
        
        System.out.println();
        System.out.printf("Rectangle PERIMETER is: %.2f", rect.perimeter());
        System.out.println();

        System.out.printf("Rectangle DIAGONAL is: %.2f", rect.diagonal());
        
        sc.close();
    }
}
