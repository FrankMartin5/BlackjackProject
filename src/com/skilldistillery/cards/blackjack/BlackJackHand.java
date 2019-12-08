package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Hand;

public class BlackjackHand extends Hand {

	public BlackjackHand() {

	}

	@Override
	public int getHandValue() {
		int sum = 0;
		for (Card card : this.cards) {
			sum += card.getValue();
		}
		return sum;
	}

	public boolean isBlackjack() {
		int sum = getHandValue();
		if (sum == 21) {
			return true;
		}
		return false;
	}

	public boolean isBust() {
		int sum = getHandValue();
		if (sum < 22) {
			return false;
		}
		return true;
	}

}
