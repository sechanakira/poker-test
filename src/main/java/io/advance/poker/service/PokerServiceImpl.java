package io.advance.poker.service;

import org.springframework.stereotype.Service;

import io.advance.poker.exception.GameNotFoundException;
import io.advance.poker.main.game.StandardPokerGame;
import io.advance.poker.main.logic.StandardPokerEvaluation;
import io.advance.poker.model.CreateGameDto;
import io.advance.poker.model.GameDto;
import io.advance.poker.model.GameResultDto;

@Service
public class PokerServiceImpl implements PokerService {

	private StandardPokerGame pokerGame;

	@Override
	public GameDto createGame(CreateGameDto dto) {
		StandardPokerGame pokerGame = new StandardPokerGame(new StandardPokerEvaluation(), dto.getPlayers(),
				dto.getCardsPerPlayer(), null);
		GameDto gameDto = new GameDto();
		gameDto.setCardsPerPlayer(dto.getCardsPerPlayer());
		gameDto.setDeck(pokerGame.getDeck());
		gameDto.setPlayers(dto.getPlayers());
		this.pokerGame = pokerGame;
		return gameDto;
	}

	@Override
	public GameResultDto getGame() {
		if (null == this.pokerGame) {
			throw new GameNotFoundException();
		}
		GameResultDto dto = new GameResultDto();
		dto.setPlayers(this.pokerGame.getPlayers());
		dto.setDeck(this.pokerGame.deal().get(1));
		dto.setCardsPerPlayer(this.pokerGame.getCardsPerPlayer());
		dto.setEvaluation(this.pokerGame.evaluate());
		return dto;
	}
}
