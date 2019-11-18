package io.advance.poker.model;

public class CreateGameDto {

	private int players;

	private int cardsPerPlayer;

	private String pokerVariant;

	private String shufflingMethod;

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

	public String getPokerVariant() {
		return this.pokerVariant;
	}

	public void setPokerVariant(final String pokerVariant) {
		this.pokerVariant = pokerVariant;
	}

	public String getShufflingMethod() {
		return this.shufflingMethod;
	}

	public void setShufflingMethod(final String shufflingMethod) {
		this.shufflingMethod = shufflingMethod;
	}
}
