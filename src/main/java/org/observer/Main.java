package org.observer;

import org.observer.client.Client;
import org.observer.store.Game;
import org.observer.store.Store;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Game game1 = new Game("Metal Gear Solid 27", false);
        Game game2 = new Game("Cyber Punk 2077", false);
        Game game3 = new Game("Fifa 27", false);

        Client client1 = new Client("Luis Figo", game1);
        Client client2 = new Client("Francesco Totti", game2);
        Client client3 = new Client("Ronaldinho Gaucho", game2);
        Client client4 = new Client("Oliver Kahn", game2);
        Client client5 = new Client("Pipo Inzaghi", game3);

        Store store = new Store();

        //Add a client and the desired game to the waiting list
        store.add(client1);
        store.add(client2);
        store.add(client3);
        store.add(client4);
        store.add(client5);



        store.listSubs();
        store.remove(client3);
        System.out.println(" ");
        store.listSubs();

        System.out.println(" ");
        store.checkStock("Metal Gear Solid 27");
        store.notifySubscriber();
        System.out.println(" ");
        game1.setStock(true);
        store.checkStock("Metal Gear Solid 27");
        System.out.println(" ");
        store.notifySubscriber();

    }

}
