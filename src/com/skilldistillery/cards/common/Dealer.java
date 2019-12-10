package com.skilldistillery.cards.common;



import com.skilldistillery.cards.blackjack.BlackjackHand;

public class Dealer {
	private Deck deck;
	BlackjackHand hand;
	
	public Dealer() {
		this.hand = new BlackjackHand();
		this.deck = new Deck();
		
	}

	
	
}
