package com.invader.game.handlers;

public class sInput {
	
	public static int x;
	public static int y;
	
	public static boolean down;
	public static boolean pdown;
	public static boolean back;
	
	public static boolean isDown() { return down; }
	public static boolean isPressed() { return down && !pdown; }
	
	public static void update() {
		pdown = down;
	}
	
	

}
