package com.HA.volume;

public class Task3 {

	public static void main(String[] args) {

		Volume vol1 = new Volume(); // object for Volume of Sphere
		Volume vol2 = new Volume();// object for Volume of Cuboid
		Volume vol3 = new Volume();// object for Volume of Cylinder
		Volume vol4 = new Volume();// Object for Volume of Cone

		double r = 10;
		vol1.voulmeOfSphere(r);

		double w = 15;
		double l = 10;
		double h = 5;
		vol2.volumeOfCuboid(w, l, h);

		double a = 20;
		double b = 30;
		vol3.volumeOfCylinder(a, b);

		double x = 5;
		double y = 5;
		vol4.volumeOfCone(x, y);
	}

}
