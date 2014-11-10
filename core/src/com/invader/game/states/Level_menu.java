package com.invader.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.invader.game.assets.Assets;
import com.invader.game.handlers.GameStateManager;
import com.invader.game.handlers.sInput;
import com.invader.game.main.Game;

public class Level_menu extends GameState {

	public enum x_points {
		   x, y, end_x, end_y;
	}	
	
	public Level_menu(GameStateManager gsm) {
		super(gsm);				
	}
	
	public void handleInput() {}
	
	public void update() {
		cam.update();
	}
	
	public void render() {

		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl20.glClearColor(255f, 255f, 255f, 0f);
		super.cam.update();
		super.sb.setProjectionMatrix(cam.combined);

		super.sb.begin();		
		
		int ilevel = 0;
		for (int col = Assets.iLevelHeight; col > 0; col -= (Assets.iLevelHeight / 3)) {
			for (int row = 0; row < Assets.iLevelWidth; row += (Assets.iLevelWidth / 6)) {
				
				super.sb.draw(Assets.levels[ilevel], 
						(Game.V_WIDTH / 2) - (Assets.iLevelWidth / 2) + (Assets.iLevelWidth / 6) + row, 
						(Game.V_HEIGHT / 2)  - (Assets.iLevelHeight / 2) - (Assets.iLevelHeight / 3) + col);
				
				
				ilevel += 1;
			}
		}
		
		if (sInput.isPressed()) {
			System.out.println(sInput.x + " _ " + sInput.y);
		}
		
		super.sb.end();
	}
	
	public void dispose() {}

	
	
	
}
