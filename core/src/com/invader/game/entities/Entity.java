package com.invader.game.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class Entity {
	
	protected Sprite sp;
	protected Vector2 pos, direction;
	
	public Entity(Sprite sp, Vector2 pos, Vector2 direction) {
		this.sp = sp;
		this.pos = pos;
		this.direction = direction;
	}
	
	public abstract void update();
	
	public void render(SpriteBatch sb) {
		sb.draw(sp, pos.x, pos.y);
	}

	public Vector2 getPosition() {
		return pos;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(pos.x, pos.y, sp.getWidth(), sp.getHeight());
	}
	
	public void setDirection(float x, float y) {
		direction.set(x, y);
		direction.scl(Gdx.graphics.getDeltaTime());
	}	
	
}
