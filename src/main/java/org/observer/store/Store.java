package org.observer.store;

import org.observer.Observable;
import org.observer.Observer;
import org.observer.client.Client;

import java.util.*;

public class Store implements Observable {

    private LinkedList<Observer> list = new LinkedList<>();

    public Store() {

    }


    public void add(Observer observer) {
        list.add(observer);
    }


    public void remove(Observer observer) {
        list.remove(observer);
    }


    //notify client about the game status update
    public void notifySubscriber() {

        for(Observer client : list){
            if(client instanceof Client){
                if(((Client) client).getGame().isStock()){
                    client.update();
                }
            }
        }
    }



    //list all subscribers and the game they want
    public void listSubs(){

        System.out.println("### SUBSCRIBERS LIST ###");

        for(Observer client : list){

            if(client instanceof Client){
                System.out.println(((Client) client).getName() + " pre-ordered: " + ((Client) client).getGame().getGameName());
            }
        }
    }


    //checks stock of an specific game
    public void checkStock(String name){

        System.out.println("### STOCK INFO ###");

        for(Observer client : list){
            if(client instanceof Client){
                if(name.equals(((Client) client).getGame().getGameName())) {
                    System.out.println("Game: " + ((Client) client).getGame().getGameName() + "\nStatus: " + (((Client) client).getGame().isStock() ? "in stock" : "out of stock"));
                }
            }
        }
    }

}
