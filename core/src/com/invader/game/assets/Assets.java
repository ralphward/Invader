package com.invader.game.assets;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Assets {
	
	public static Sprite sp_load;
	public static Sprite sp_menu;
	public static Sprite sp_sheet;
	public static Texture level_select;
	public static Sprite[] levels;
	public static int iLevelWidth;
	public static int iLevelHeight;
	
	public static Sprite PLAYER; 
	
	public static void loadAssets()
	{
		sp_load = new Sprite(new Texture(Gdx.files.internal("load.png")));
		sp_menu = new Sprite(new Texture(Gdx.files.internal("main_menu.png")));
		level_select = new Texture(Gdx.files.internal("level_select.png"));
		
		levels = new Sprite[18];
		int x = level_select.getWidth();
		int y = level_select.getHeight();
		iLevelWidth = x;
		iLevelHeight = y;
		
		int ilevel = 0;
		for (int col = 0; col < y; col += (y / 3)) {
			for (int row = 0; row < x; row += (x / 6)) {
				levels[ilevel] = new Sprite(level_select, row, col, (x / 6), (y / 3));
				ilevel += 1;
			}
		}
				
				
		
	}
	
}
