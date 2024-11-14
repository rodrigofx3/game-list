package dev.rodrigoramos.game_list.services;

import dev.rodrigoramos.game_list.dto.GameDTO;
import dev.rodrigoramos.game_list.dto.GameMinDTO;
import dev.rodrigoramos.game_list.entities.Game;
import dev.rodrigoramos.game_list.repositories.GameMinProjection;
import dev.rodrigoramos.game_list.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game entity = repository.findById(id).orElseThrow();
        return new GameDTO(entity);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = repository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long id) {
        List<GameMinProjection> result = repository.searchByList(id);
        return result.stream().map(GameMinDTO::new).toList();
    }
}
