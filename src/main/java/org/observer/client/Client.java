package org.observer.client;

import org.observer.Observer;
import org.observer.store.Game;


public class Client implements Observer {

    private Game game;
    private String name;


    public Client(String name, Game game){
        this.name = name;
        this.game = game;
    }


    public void update() {
            System.out.println("Hey " + this.name + " " + this.game.getGameName() + " is now available for purchase");
    }


    public Game getGame() {
        return game;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
