package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand {
	
	
	public BlackjackHand() {
		
	}
	

	@Override
	public int getHandValue() {
		return 0;
	}
	public boolean isBlackjack() {
		 return true;
	}
	public boolean isBust() {
		return true;
	}

}
