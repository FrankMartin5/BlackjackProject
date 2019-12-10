package com.skilldistillery.cards.blackjack;

import java.util.Scanner;

import com.skilldistillery.cards.common.Dealer;
import com.skilldistillery.cards.common.Player;

public class BlackjackApp {
	private Dealer dealer;
	private Player player;

	public static void main(String[] args) {
		BlackjackApp app = new BlackjackApp();
		app.startGame();
	}

	public void startGame() {
		Scanner kb = new Scanner(System.in);
		
	}
	public Dealer createDealer() {
		Dealer dealer = new Dealer();
		return dealer;
	}
}
