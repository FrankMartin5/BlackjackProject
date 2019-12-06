package com.skilldistillery.cards.common;

public class Card {
	// F i e l d s
	private Rank rank;
	private Suit suit;
	
	// C o n s t r u c t o r s
	
	public Card(Rank rank, Suit suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}
	
	// M e t h o d s
	
	public int getValue() {
		return rank.getValue();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (rank != other.rank)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(rank);
		builder.append(" of ");
		builder.append(suit);
		return builder.toString();
	}


	
	
}