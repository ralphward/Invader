package com.invader.game.main;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.invader.game.assets.Assets;
import com.invader.game.camera.OrthoCamera;
import com.invader.game.handlers.GameStateManager;
import com.invader.game.handlers.MyInputProcessor;
import com.invader.game.handlers.sInput;

//public class Game implements ApplicationListener {
public class Game extends ApplicationAdapter {
	
	public static final String TITLE = "Invader";
	public static final int V_WIDTH = 960;
	public static final int V_HEIGHT = 640;
	
	private SpriteBatch sb;
	private OrthoCamera cam;

	private GameStateManager gsm;
	
	public void create() {		
		sb = new SpriteBatch();
		cam = new OrthoCamera();
		cam.setToOrtho(false, V_WIDTH, V_HEIGHT);
		gsm = new GameStateManager(this);
		Assets.loadAssets();
		Gdx.input.setInputProcessor(new MyInputProcessor());
		Gdx.input.setCatchBackKey(true);
	}
	
	public void render() {
		gsm.update();
		gsm.render();
		sInput.update();
		if (gsm.finished()) 
			Gdx.app.exit();
			
	}
	
	public void dispose() {
	}
	
	public OrthographicCamera getCamera() { 
		return cam; 
	}
		
	public void resize(int w, int h) {
		cam.resize();
	}
	
	public void pause() {}
	
	public void resume() {}

	public SpriteBatch getSpriteBatch() {
		return sb;
	}
	
}
