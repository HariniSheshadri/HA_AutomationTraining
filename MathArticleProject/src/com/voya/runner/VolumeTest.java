package com.voya.runner;

import com.HA.volume.Volume;

public class VolumeTest {

	public static void main(String[] args) {
		Volume vol1 = new Volume();
		double r = 15.5;
		vol1.voulmeOfSphere(r);
		
		Volume vol2 = new Volume();
		double w = 20.5;
		double l = 20;
		double h = 65.2;
		vol2.volumeOfCuboid(w, l, h);


	}

}
