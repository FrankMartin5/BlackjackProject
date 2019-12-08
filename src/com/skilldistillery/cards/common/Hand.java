package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;


public abstract class Hand {
	protected List<Card> cards;
	
	public Hand() {
		this.cards = new ArrayList<Card>();
	}
	
	public void clear() {
		this.cards = new ArrayList<Card>();
	}
	
	public void addCard(Card card) {
		this.cards.add(card);
	}
	
	public abstract int getHandValue();

	@Override
	public String toString() {
		return cards.toString();
	}
	
	


}
