package com.skilldistillery.cards.common;



import com.skilldistillery.cards.blackjack.BlackjackHand;

public class Player {
	private BlackjackHand hand;
	private String name;
	
	
	public Player(String name){
		this.name = name;
		this.hand = new BlackjackHand();
	}
	
	public void hit(Card card) {
		hand.addCard(card);
	}
	public void stay() {
		System.out.println("No cards were added.");
	}
	public void showPlayerHand() {
		System.out.println(hand.toString());
	}
	
	public BlackjackHand getHand() {
		return hand;
	}
	public BlackjackHand setHand() {
		return hand;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Player [hand=");
		builder.append(hand);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
//	public void printHandAndValue(List<Card> hand, int value) {
//		for (Card card : hand) {
//			System.out.println(card);
//		}
//		System.out.println("Current hand is worth: "+ value);
//	}

}
