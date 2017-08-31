import java.util.Scanner;
public class Runner {
	public static void main(String[] args) {
		Cylinder c = new Cylinder(7,6);
		Sphere s = new Sphere(6);
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("What is this shape");  
		String shape = scanner.next(); // Get what the user types.{
		if(shape.equalsIgnoreCase("Cylinder")){
			System.out.println("the raidus of this Cylinder is  " +c.getRadius());
			System.out.println("the height of this Cylinder  is " + c.getHeight());
			System.out.println("the diamter of this Cylinder  is " + c.getDiameter());
			System.out.println("the Area of this Cylinder  is " + c.getArea());
			System.out.println("the volume of this Cylinder  is " + c.getVolume());
		}
		else if (shape.equalsIgnoreCase("Sphere")){
			System.out.println("the raidus of this Sphere is  " +s.getRadius());
			System.out.println("the volume of this Sphere  is " + s.getVolume());
			System.out.println("the diamter of this Sphere  is " + s.getDiameter());
			System.out.println("the Area of this Sphere  is " + s.getArea());
		}
		else{
			System.out.println("That shape is not applicable");
		}
	}
}