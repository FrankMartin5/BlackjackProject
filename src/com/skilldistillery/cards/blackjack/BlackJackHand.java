package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackJackHand extends Hand {

//	private int totalHandValue;

	public BlackJackHand() {
	}

	@Override
	public int getHandValue() {
		int totalHandValue = 0;
		for (Card card : getHand()) {
			totalHandValue += card.getValue();
		}
		return totalHandValue;

	}

	public void displayHand() {
		for (Card card : getHand()) {
			System.out.println(card.toString());
		}
	}

}