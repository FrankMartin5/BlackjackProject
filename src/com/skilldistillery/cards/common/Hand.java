package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.List;


public abstract class Hand {
	protected List<Card> cards = new ArrayList<>();
	
	public Hand() {
		
	}
	
	public void clear() {
		
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	public void printHandandValue(List<Card> hand, int value) {
		for (Card card : hand) {
			System.out.println(card);
		}
		System.out.println("Current value is "+ value);
	}
	
	public abstract int getHandValue();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hand [cards=");
		builder.append(cards);
		builder.append("]");
		return builder.toString();
	}
	
	


}
//
//public void printHandAndValue(List<Card> hand, int value) {
//	for (Card card : hand) {
//		System.out.println(card);
//	}
//	System.out.println("Total Value: " + value);
//}
