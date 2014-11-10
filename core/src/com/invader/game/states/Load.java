package com.invader.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.invader.game.assets.Assets;
import com.invader.game.handlers.GameStateManager;
import com.invader.game.main.Game;

public class Load extends GameState {

	public Load(GameStateManager gsm) {
		super(gsm);				
	}
	
	public void handleInput() {}
	
	public void update() {
		if (Gdx.input.justTouched()) {			
			gsm.setState(GameStateManager.MENU);			
			System.out.println(((Game.V_WIDTH / 2) - (Assets.sp_load.getWidth() / 2)) + "- " + ((Game.V_HEIGHT / 2)  - (Assets.sp_load.getHeight() / 2)));
			cam.update();
		}
	}
	
	public void render() {

		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl20.glClearColor(255f, 255f, 255f, 0f);
		super.cam.update();
		super.sb.setProjectionMatrix(cam.combined);

		super.sb.begin();		
		//super.sb.draw(Assets.sp_load, (Game.V_WIDTH / 2) - (Assets.sp_load.getWidth() / 2), (Game.V_HEIGHT / 2)  - (Assets.sp_load.getHeight() / 2));
		super.sb.draw(Assets.sp_load, 0, 0, Game.V_WIDTH, Game.V_HEIGHT);
		super.sb.end();
	
	}
	
	public void dispose() {}

	
	
}
