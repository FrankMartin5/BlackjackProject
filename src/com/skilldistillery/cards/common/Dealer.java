package com.skilldistillery.cards.common;



import com.skilldistillery.cards.blackjack.BlackjackHand;

public class Dealer extends Player {
	private Deck deck;
	BlackjackHand hand;

	public Dealer() {

	}
	

	public void dealCardToPlayer(Player p) {
		p.getHand().addCard(deck.dealCard());
	}
	public void dealCardToDealer(Dealer d) {
		d.getHand().addCard(deck.dealCard());
	}
}
