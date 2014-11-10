package com.invader.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.invader.game.assets.Assets;
import com.invader.game.handlers.GameStateManager;
import com.invader.game.main.Game;

public class main_menu extends GameState {

	public main_menu(GameStateManager gsm) {
		super(gsm);				
	}
	
	public void handleInput() {}
	
	public void update() {
		cam.update();
		
		if (Gdx.input.justTouched()) {
			if (Gdx.input.getY() < 310) {
				gsm.pushState(GameStateManager.LEVEL_MENU);
			} else if (Gdx.input.getY() < 620) {
				gsm.pushState(GameStateManager.SETTINGS_MENU);			
			} else {
				gsm.pushState(GameStateManager.CREDITS);
			}
		}
		
	}
	
	public void render() {

		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl20.glClearColor(255f, 255f, 255f, 0f);
		super.cam.update();
		super.sb.setProjectionMatrix(cam.combined);

		super.sb.begin();		
		//super.sb.draw(Assets.sp_menu, (Game.V_WIDTH / 2) - (Assets.sp_menu.getWidth() / 2), (Game.V_HEIGHT / 2)  - (Assets.sp_menu.getHeight() / 2));
		super.sb.draw(Assets.sp_menu,  0, 0, Game.V_WIDTH, Game.V_HEIGHT);
		super.sb.end();
	}
	
	public void dispose() {}

	
	
}
