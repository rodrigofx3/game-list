package dev.rodrigoramos.game_list.controllers;

import dev.rodrigoramos.game_list.dto.GameListDTO;
import dev.rodrigoramos.game_list.dto.GameMinDTO;
import dev.rodrigoramos.game_list.dto.ReplacementDTO;
import dev.rodrigoramos.game_list.services.GameListService;
import dev.rodrigoramos.game_list.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping
    @RequestMapping("/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getTargetIndex());
    }

}
