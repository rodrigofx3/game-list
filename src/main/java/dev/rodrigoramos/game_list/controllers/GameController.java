package dev.rodrigoramos.game_list.controllers;

import dev.rodrigoramos.game_list.dto.GameDTO;
import dev.rodrigoramos.game_list.dto.GameMinDTO;
import dev.rodrigoramos.game_list.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/games")
@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    @RequestMapping("/{id}")
    public GameDTO findById(@PathVariable Long id) {
        return gameService.findById(id);
    }

    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }

}
