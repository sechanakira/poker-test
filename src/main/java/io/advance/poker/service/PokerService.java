package io.advance.poker.service;

import io.advance.poker.model.CreateGameDto;
import io.advance.poker.model.GameDto;
import io.advance.poker.model.GameResultDto;

public interface PokerService {

	GameDto createGame(CreateGameDto dto);

	GameResultDto getGame();
}
