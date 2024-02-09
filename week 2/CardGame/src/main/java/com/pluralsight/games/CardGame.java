package com.pluralsight.games;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class CardGame
{
    private ArrayList<Hand> players = new ArrayList<>();

    public void start()
    {
        // start by adding a few players
        players.add(new Hand("Daisy"));
        players.add(new Hand("Tee"));
        players.add(new Hand("Gabe"));

        // initiate new deck for the game
        Deck deck = new Deck();
        // shuffle the cards
        deck.shuffle();
        // keep track of a winning hand
        Hand winningPlayer = players.get(0);
////         loop through the players and deal the cards from the deck
//        for (Hand player: players) {
//
//            // deal a card twice for each player (as per rules of Black Jack)
//            for (int i = 0; i < 2; i++) {
//                // remove a card from the deck
//                Card cardDealt = deck.deal();
//                // add it to the players Hand
//                player.deal(cardDealt);
//            }
//
//            if (player.getValue() > winningPlayer.getValue()) {
//                winningPlayer = player;
//            }
//        } 

        // display the winner
        System.out.println("The winning player is " + winningPlayer.getPlayerName() + "with a hand of " + winningPlayer.getValue());
    }
}
