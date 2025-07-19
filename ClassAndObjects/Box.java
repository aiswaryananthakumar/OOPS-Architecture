package ClassAndObjects;

import java.util.Scanner;

public class Box {
	double width, height, depth;
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double getVolume() {
        return width * height * depth;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.print("Enter depth: ");
        double d = sc.nextDouble();

        Box myBox = new Box(w, h, d);
        System.out.println("Volume of the box: " + myBox.getVolume());

        sc.close();

	}

}
