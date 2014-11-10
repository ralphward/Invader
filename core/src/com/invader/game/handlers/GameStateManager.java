package com.invader.game.handlers;

import java.util.Stack;

import com.invader.game.main.Game;
import com.invader.game.states.GameState;
import com.invader.game.states.Level_menu;
import com.invader.game.states.Load;
import com.invader.game.states.Play;
import com.invader.game.states.Settings;
import com.invader.game.states.credits;
import com.invader.game.states.main_menu;

public class GameStateManager {
	
	private Game game;
	
	private Stack<GameState> gameStates;
	
	public static final int PLAY = 912837;
	public static final int LOAD = 998411;
	public static final int MENU = 465123;
	public static final int SETTINGS_MENU = 121546;
	public static final int LEVEL_MENU = 465487;
	public static final int CREDITS = 465483;
	
	public GameStateManager(Game game) {
		this.game = game;
		gameStates = new Stack<GameState>();
		pushState(LOAD);
	}
	
	public Game game() { return game; }

	public boolean finished()
	{
		return gameStates.empty();
	}
	
	public void update() {	
		if(!gameStates.empty())
			gameStates.peek().update();
		
		if (sInput.back) {
			popState();
			sInput.back = false;
		}
		
	}
	
	public void render() {
		if(!gameStates.empty())
			gameStates.peek().render();
	}
	
	private GameState getState(int state) {
		if(state == LOAD) 
			return new Load(this);
		if(state == PLAY) 
			return new Play(this);
		if(state == SETTINGS_MENU) 
			return new Settings(this);
		if(state == LEVEL_MENU) 
			return new Level_menu(this);
		if(state == MENU) 
			return new main_menu(this);
		if(state == CREDITS) 
			return new credits(this);
		
		return null;
	}
	
	public void setState(int state) {
		popState();
		pushState(state);
	}
	
	public void pushState(int state) {
		gameStates.push(getState(state));
	}
	
	public void popState() {
		GameState g = gameStates.pop();
		g.dispose();
	}
	
}

