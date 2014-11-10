package com.invader.game.entities;

import com.badlogic.gdx.math.Vector2;
import com.invader.game.assets.Assets;
import com.invader.game.camera.OrthoCamera;

public class Player extends Entity {

	private final EntityManager entityManager;
	private final OrthoCamera camera;
	
	public Player(Vector2 pos, Vector2 direction, EntityManager entityManager, OrthoCamera camera) { 
		super(Assets.PLAYER, pos, direction);
		this.entityManager = entityManager;
		this.camera = camera;
	}

	public void update() {
		
	}
	
}
