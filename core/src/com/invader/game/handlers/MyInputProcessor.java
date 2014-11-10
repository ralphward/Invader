package com.invader.game.handlers;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;

public class MyInputProcessor extends InputAdapter {

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		sInput.x = screenX;
		sInput.y = screenY;
		sInput.down = true;
		return true;
	}
	
	@Override
	public boolean touchUp(int x, int y, int pointer, int button) {
		sInput.x = x;
		sInput.y = y;
		sInput.down = false;
		return true;
	}
	
	@Override
	   public boolean keyDown(int keycode) {
	        if(keycode == Keys.BACK){
	        	sInput.back = true;
	        	System.out.println("back pressed");
	        }
	        return true;
	   }	

}
