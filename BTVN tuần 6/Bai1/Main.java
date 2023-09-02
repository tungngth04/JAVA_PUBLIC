package Bai1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Dog dog = new Dog();
		Cat cat = new Cat();
		System.out.println("Dog: ");
		dog.input(sc);
		dog.output();
		dog.tiengKeu();
		
		System.out.println("Cat: ");
		cat.input(sc);
		cat.output();
		cat.tiengKeu();
	}
}
