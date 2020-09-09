package com.elena;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;

public class RandomMover {
	public static final int PAUSE_TIME = 120000;
	public static final int MAX_X = 500;
	public static final int MAX_Y = 500;

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		Robot robot = new Robot();
		Random random = new Random();
		
		try {
			Thread.sleep(PAUSE_TIME / 120);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		while (true) {
			int x = random.nextInt(MAX_X), y = random.nextInt(MAX_Y);
			System.out.println("mouse will move to (" + x + ", " + y + ");");
			robot.mouseMove(x, y);
			Thread.sleep(PAUSE_TIME);
		}
	}

}
