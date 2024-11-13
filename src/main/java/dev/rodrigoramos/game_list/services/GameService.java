package dev.rodrigoramos.game_list.services;

import dev.rodrigoramos.game_list.dto.GameMinDTO;
import dev.rodrigoramos.game_list.entities.Game;
import dev.rodrigoramos.game_list.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll() {
        List<Game> result = repository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
