package org.observer.store;

public class Game {

    private String gameName;
    private boolean stock;


    public Game(String name, boolean stock){
        this.gameName = name;
        this.stock = stock;
    }

    public String getGameName() {
        return gameName;
    }

    public boolean isStock() {
        return stock;
    }


    public void setStock(boolean stock) {
        this.stock = stock;
    }


}
