package com.HA.volume;

public class Volume {

	public double V;

	public void voulmeOfSphere(double r) {

		if (r > 0) {
			double temp = 4 / 3;
			V = temp * r * r * r * Math.PI;
		} else {
			System.out.println("Invalid input");
		}

		System.out.println("Volume of Sphere is " + V);

	}

	public void volumeOfCuboid(double w, double l, double h) {
		if (w > 0 && l > 0 && h > 0) {
			V = w * l * h;
		} else {
			System.out.println("Invalid input");
		}
		System.out.println("Volume of Cuboid is " + V);

	}

	public void volumeOfCylinder(double a, double b) {
		if (a > 0) {
			V = Math.PI * a * a * b;
		} else {
			System.out.println("Invalid input");
		}
		System.out.println("Volume of Cylinder is " + V);
	}

	public void volumeOfCone(double x, double y) {
		if (x > 0 && y > 0) {
			double temp = y / 3;
			V = Math.PI * x * x * temp;
		} else {
			System.out.println("Invalid input");
		}
		System.out.println("Volume of Cone is " + V);
	}

}