package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;

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
//public void getHand() {
//	int numOfCards = 2;
//	List<Card> hand = new ArrayList<>(numOfCards);
//	int totalValue = 0;
//	for (int i = 0; i < numOfCards; i++) {
//		Card card = deck.dealCard();
//		totalValue += card.getValue();
//		hand.add(card);
//	}
//	printHandandValue(hand, totalValue);
//}
//public void printHandandValue(List<Card> hand, int value) {
//	for (Card card : hand) {
//		System.out.println(card);
//	}
//	System.out.println("Current value is ");
//}