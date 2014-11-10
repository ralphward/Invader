package com.invader.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.invader.game.handlers.GameStateManager;


public class Play extends GameState {
	
	
	public Play(GameStateManager gsm) {
		super(gsm);				
	}
	
	public void handleInput() {}
	
	public void update() {}
	
	public void render() {

		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
		super.cam.update();
		super.sb.setProjectionMatrix(cam.combined);

		super.sb.begin();		

		super.sb.end();
	}
	
	public void dispose() {}
	
}


