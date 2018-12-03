import java.awt.Robot;
import java.awt.AWTException;
import java.lang.Object;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.geom.Point2D;
import java.awt.Point;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.Rectangle;



public class Class {
	
	public static int step = 1;
	
	public static void move(Robot rob, int x, int y) {
		y -= 15;
		Point point = new Point(x,y);
		while (MouseInfo.getPointerInfo().getLocation().y != y || MouseInfo.getPointerInfo().getLocation().x != x) {
			rob.mouseMove(x,y);
		}
	}
	
	public static void chill(int red, int green, int blue, int x, int y, Robot rob) {
		try {
			Thread.sleep(100);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		y -= 15;
		Color color = rob.getPixelColor(x,y);
		int tryNum = 0;
		while (color.getRed() != red || color.getGreen() != green || color.getBlue() != blue){
			tryNum += 1;
			try {
				color = rob.getPixelColor(x,y);
				Thread.sleep(10);
			} catch (InterruptedException ex) {
				System.out.println("Error");
			}
			
			if (tryNum == 5001) {
				rob.mousePress(InputEvent.BUTTON1_MASK);
				rob.mouseRelease(InputEvent.BUTTON1_MASK);
				System.out.println("chill clicked");
				try {
					Thread.sleep(100);
				} catch (InterruptedException ex) {
					System.out.println("Error");
				}
			}
			
			if (tryNum >= 10001) {
				color = new Color(red, green, blue);
				System.out.println("chill failed");
				step = 30;
			}
		}
		try {
			Thread.sleep(500);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	
    public static void main(String[] args){
		try {
			Thread.sleep(10000);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		int whilenum = 1;
		while (whilenum == 1) {
			
			try {
				Robot robot = new Robot();
				Thread.sleep(10);
				
				if (step == 1){
					
				System.out.println("Step 1 Starting");
				
				move(robot, 376,425);
				Thread.sleep(200);
				step += 1; }
				
				if (step == 2){
				System.out.println("Step 2 Starting");
				
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				Thread.sleep(200);
				step += 1; }
				
				if (step == 3){
				
				System.out.println("Step 3 Starting");
				
				move(robot, 340,478);
				Thread.sleep(300);
				step += 1; }
				
				if (step == 4){
				
				System.out.println("Step 4 Starting");
				
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				Thread.sleep(200);
				step += 1; }
				
				if (step == 5){
				
				System.out.println("Step 5 Starting");
				
				move(robot, 339,486);
				Thread.sleep(200);
				step += 1; }
				
				if (step == 6){
				
				System.out.println("Step 6 Starting");
				
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				Thread.sleep(200);
				step += 1; }
				
				if (step == 7){
				
				System.out.println("Step 7 Starting");
				
				move(robot, 324,501);
				Thread.sleep(300);
				step += 1; }
				
				if (step == 8){
				
				System.out.println("Step 8 Starting");
				
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				Thread.sleep(200);
				step += 1; }
				
				if (step == 9){
				
				System.out.println("Step 9 Starting");
				
				move(robot, 447,483);
				Thread.sleep(200);
				step += 1; }
				
				if (step == 10){
				
				System.out.println("Step 10 Starting");
				
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				step += 1; }
				
				if (step == 11){
				
				System.out.println("Step 11 Starting");
				
				chill(128,128,128,376,384,robot);
				step += 1; }
				
				if (step == 12){
				
				System.out.println("Step 12 Starting");
				
				move(robot, 537,541);
				Thread.sleep(200);
				step += 1; }
				
				if (step == 13){
				
				System.out.println("Step 13 Starting");
				
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				step += 1; }
				
				if (step == 14){
				
				System.out.println("Step 14 Starting");
				
				chill(218,226,238,574,859,robot);
				step += 1; }
				
				if (step == 15){
				
				System.out.println("Step 15 Starting");
				
				robot.mouseWheel(6);
				Thread.sleep(200);
				step += 1; }
				
				if (step == 16){
				
				System.out.println("Step 16 Starting");
				
				move(robot, 507,738);
				Thread.sleep(300);
				step += 1; }
				
				if (step == 17){
				
				System.out.println("Step 17 Starting");
				
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				step += 1; }
				
				if (step == 18){
				
				System.out.println("Step 18 Starting");
				
				chill(153,0,51,557,563,robot);
				step += 1; }
				
				if (step == 19){
				
				System.out.println("Step 19 Starting");
				
				move(robot, 26,512);
				Thread.sleep(200);
				step += 1; }
				
				if (step == 20){
				
				System.out.println("Step 20 Starting");
				
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				Thread.sleep(200);
				step += 1; }
				
				if (step == 21){
				
				System.out.println("Step 21 Starting");
				
				move(robot, 530,564);
				Thread.sleep(200);
				step += 1; }
				
				if (step == 22){
				
				System.out.println("Step 22 Starting");
				
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				step += 1; }
				
				if (step == 23){
				
				System.out.println("Step 23 Starting");
				
				chill(153,0,51,544,605,robot);
				step = 2000; }
				
				if (step == 2000){
				
				System.out.println("Step 23.5 (2000) Starting");
				
				move(robot, 386,405);
				Thread.sleep(200);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				Thread.sleep(200);
				step = 24; }
				
				if (step == 24){
				
				System.out.println("Step 24 Starting");
				
				move(robot, 544,605);
				Thread.sleep(200);
				step += 1; }
				
				if (step == 25){
				
				System.out.println("Step 25 Starting");
				
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				step += 1; }
				
				if (step == 26){
				
				System.out.println("Step 26 Starting");
				
				chill(153,0,51,573,778,robot);
				step += 1; }
				
				if (step == 27){
				
				System.out.println("Step 27 Starting");
				
				move(robot, 573,778);
				Thread.sleep(200);
				step += 1; }
				
				if (step == 28){
				
				System.out.println("Step 28 Starting");
				
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				step += 1; }
				
				if (step == 29){
				
				System.out.println("Step 29 Starting");
				
				chill(223,72,37,403,399,robot);
				step += 1; }
				
				if (step == 30){
				
					System.out.println("Step 30 Starting");
				
					Color finalColor = robot.getPixelColor(551,445);
					if (finalColor.getRed() == 223 && finalColor.getGreen() == 72 && finalColor.getBlue() == 37) {
						System.out.println("Failed step 1 starting");
				
						move(robot, 362,213);
						Thread.sleep(200);
					
						System.out.println("Failed step 2 starting");
					
						robot.mousePress(InputEvent.BUTTON1_MASK);
						robot.mouseRelease(InputEvent.BUTTON1_MASK);
					
						System.out.println("Failed step 3 starting");
						
						step = 0;
					
						chill(153,0,51,520,615,robot);
						
						step += 1;
					} else {
						whilenum = 0;
						System.out.println("IT WORKED!!!");
					}
				}
				
				if (step == 31) {
					System.out.println("Reset step 1(31) Starting");
					
					robot.keyPress(KeyEvent.VK_ALT);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_F4);
					Thread.sleep(50);
					robot.keyRelease(KeyEvent.VK_F4);
					Thread.sleep(50);
					robot.keyRelease(KeyEvent.VK_ALT);
					
					Thread.sleep(200);
					
					step += 1;
				}
				
				if (step == 32) {
					System.out.println("Reset step 2(32) Starting");
					
					move(robot, 469,1076);
					Thread.sleep(200);
					
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					Thread.sleep(200);
					
					move(robot, 108,69);
					
					System.out.println("Reset step 3(33) Starting");
					
					chill(153,0,51,835,356,robot);
					
					step += 1;
				}
				
				if (step == 33) {
					System.out.println("Reset step 3(33) Starting");
					
					move(robot, 710,454);
					Thread.sleep(200);
					
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					Thread.sleep(200);
					
					robot.keyPress(KeyEvent.VK_BACK_SPACE);
					robot.keyRelease(KeyEvent.VK_BACK_SPACE);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_BACK_SPACE);
					robot.keyRelease(KeyEvent.VK_BACK_SPACE);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_BACK_SPACE);
					robot.keyRelease(KeyEvent.VK_BACK_SPACE);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_BACK_SPACE);
					robot.keyRelease(KeyEvent.VK_BACK_SPACE);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_BACK_SPACE);
					robot.keyRelease(KeyEvent.VK_BACK_SPACE);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_BACK_SPACE);
					robot.keyRelease(KeyEvent.VK_BACK_SPACE);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_BACK_SPACE);
					robot.keyRelease(KeyEvent.VK_BACK_SPACE);
					Thread.sleep(200);
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_V);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_E);
					robot.keyRelease(KeyEvent.VK_E);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_Z);
					robot.keyRelease(KeyEvent.VK_Z);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_I);
					robot.keyRelease(KeyEvent.VK_I);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_N);
					robot.keyRelease(KeyEvent.VK_N);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_V);
					Thread.sleep(200);
					
					move(robot, 655,478);
					Thread.sleep(200);
					
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					Thread.sleep(200);
					
					robot.keyPress(KeyEvent.VK_SHIFT);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_F);
					robot.keyRelease(KeyEvent.VK_F);
					Thread.sleep(50);
					robot.keyRelease(KeyEvent.VK_SHIFT);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_E);
					robot.keyRelease(KeyEvent.VK_E);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_R);
					robot.keyRelease(KeyEvent.VK_R);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_R);
					robot.keyRelease(KeyEvent.VK_R);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_I);
					robot.keyRelease(KeyEvent.VK_I);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_1);
					robot.keyRelease(KeyEvent.VK_1);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_1);
					robot.keyRelease(KeyEvent.VK_1);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_SHIFT);
					Thread.sleep(50);
					robot.keyPress(KeyEvent.VK_1);
					robot.keyRelease(KeyEvent.VK_1);
					Thread.sleep(50);
					robot.keyRelease(KeyEvent.VK_SHIFT);
					Thread.sleep(200);
					
					move(robot, 636,527);
					Thread.sleep(200);
					
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					
					chill(153,0,51,209,114,robot);
					
					step += 1;
				}
				
				if (step == 34) {
					System.out.println("Reset step 4(34) Starting");
					
					move(robot, 1100, 435);
					Thread.sleep(200);
					
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					
					chill(238,238,238,814,348,robot);
					
					step += 1;
				}
				
				if (step == 35) {
					System.out.println("Reset step 5(35) Starting");
					
					move(robot, 32,278);
					Thread.sleep(200);
					
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					
					chill(153,0,51,492,441,robot);
					
					step += 1;
				}
				
				if (step == 36) {
					System.out.println("Reset step 6(36) Starting");
					
					move(robot, 371,214);
					Thread.sleep(200);
					
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					
					chill(153,0,51,492,478,robot);
					
					step += 1;
				}
				
				if (step == 37) {
					System.out.println("Reset step 7(37) Starting");
					
					move(robot, 31,375);
					Thread.sleep(200);
					
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					Thread.sleep(200);
					
					move(robot, 492,478);
					Thread.sleep(200);
					
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
					
					step = 0;
					
					chill(153,0,51,520,615,robot);
					
					step += 1;
				}
				
			} catch (AWTException | InterruptedException ex) {
				System.out.println("Error");
			}
		
		}
		
		try {
			System.out.println("DONE");
			Thread.sleep(1000000000);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
}