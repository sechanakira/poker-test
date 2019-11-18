package io.advance.poker.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.advance.poker.model.CreateGameDto;
import io.advance.poker.model.GameDto;
import io.advance.poker.service.PokerService;

@Controller
@RequestMapping("/poker-game")
public class PokerController {

	@Autowired
	private PokerService service;

	@ResponseBody
	@PostMapping("/create")
	public GameDto createGame(@RequestBody CreateGameDto dto){
		return service.createGame(dto);
	}

	@GetMapping
	@ResponseBody
	public GameDto getGame(){
		return service.getGame();
	}
}
