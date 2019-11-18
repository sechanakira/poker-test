package io.advance.poker.model;

import java.util.List;

import io.advance.poker.main.model.Card;

public class GameDto {

	private int players;

	private int cardsPerPlayer;

	private List<Card> deck;

	public int getPlayers() {
		return this.players;
	}

	public void setPlayers(final int players) {
		this.players = players;
	}

	public int getCardsPerPlayer() {
		return this.cardsPerPlayer;
	}

	public void setCardsPerPlayer(final int cardsPerPlayer) {
		this.cardsPerPlayer = cardsPerPlayer;
	}

	public List<Card> getDeck() {
		return this.deck;
	}

	public void setDeck(final List<Card> deck) {
		this.deck = deck;
	}
}
