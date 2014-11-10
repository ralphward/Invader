package com.invader.game.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.invader.game.camera.OrthoCamera;

public class EntityManager {

	private final Array<Entity> entities = new Array<Entity>();
	private final Player player;
	
	public EntityManager(int amount, OrthoCamera camera) {
		player = new Player(new Vector2(230, 15), new Vector2(0, 0), this, camera);
		
	}
	
	public void update() {
		for (Entity e : entities)
			e.update();
		player.update();
	}
	
	public void render(SpriteBatch sb) {
		for (Entity e : entities)
			e.render(sb);
		player.render(sb);
	}	
}
