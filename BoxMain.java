

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoxMain {
	public static void main(String[] args) {
		Set<Box> boxes = new HashSet<>();
		System.out.println("Enter the number of boxes");
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the Box "+i+" Details");
			System.out.println("Enter length");
			double length = Double.parseDouble(scanner.nextLine());
			System.out.println("Enter width");
			double width = Double.parseDouble(scanner.nextLine());
			System.out.println("Enter height");
			double height = Double.parseDouble(scanner.nextLine());
			
			Box box = new Box(length,width,height);
			
			boxes.add(box);
			
		}
		
		System.out.println("Unique boxes in the set are...");
		boxes.forEach(box -> {
			System.out.println(box);
		});
		
		
	}
}

