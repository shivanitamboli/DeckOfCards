package com.bridgelab;

	import java.util.ArrayList;

	class Cards{
	    private final String suit;
	    private final String rank;

	    public Cards(String suit, String rank) {
	        this.suit = suit;
	        this.rank = rank;
	    }

	    public String toString() {
	        return "Cards{" +
	                "suit='" + suit + '\'' +
	                ", rank='" + rank + '\'' +
	                '}';
	    }

	}

	public class DeckOfCards {
	    // using Arraylist to store unique cards
	    ArrayList<Cards> cards = new ArrayList<>(52);

	    // using array to hold suits of cards
	    private static final String[] suit = {"Clubs", "Diamonds", "Hearts", "Spade"};

	    //using array to hold ranks of cards
	    private static final String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King","Ace"};

	    /**
	     * Purpose: Method to set up the deck with unique cards.
	     *  Here nested foreach loop is used to generate 52 unique cards.
	     */
	    private void setupDeck(){
	        for (String s : suit) {
	            for (String value : rank) {
	                this.cards.add(new Cards(s, value));
	            }
	        }
	    }
	    public static void main(String[] args) {
	        System.out.println("Welcome To The Deck Of Cards Game");
	        // creating instance reference of DeckOfCards class
	        DeckOfCards deckOfCards = new DeckOfCards();
	        deckOfCards.setupDeck();
	    }
	}


