package dev.rodrigoramos.game_list.services;

import dev.rodrigoramos.game_list.dto.GameListDTO;
import dev.rodrigoramos.game_list.entities.GameList;
import dev.rodrigoramos.game_list.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository repository;

    public List<GameListDTO> findAll() {
        List<GameList> result = repository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }

}
