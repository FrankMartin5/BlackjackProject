package com.skilldistillery.cards.common;



import com.skilldistillery.cards.blackjack.BlackjackHand;

public class Player {
	
	private BlackjackHand hand;
	
	
	public Player(){
		
	}
	
	public void hit(Card card) {
		hand.addCard(card);
	}
	public void stay() {
		System.out.println("No cards were added.");
	}
	
	
	public BlackjackHand getHand() {
		return hand;
	}
	
	
	
	
	
//	public void printHandAndValue(List<Card> hand, int value) {
//		for (Card card : hand) {
//			System.out.println(card);
//		}
//		System.out.println("Current hand is worth: "+ value);
//	}

}
