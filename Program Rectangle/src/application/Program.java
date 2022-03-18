package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rectangle.width =sc.nextDouble();
		rectangle.heigth = sc.nextDouble();
		
		System.out.printf( "area = %.2f%n",  rectangle.area());
		System.out.printf("perimeter = %.2f%n", rectangle.perimeter());
		System.out.printf("diagonal = %.2f%n", rectangle.diagonal());
		
		sc.close();

	}

}
