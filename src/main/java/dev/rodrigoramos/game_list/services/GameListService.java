package dev.rodrigoramos.game_list.services;

import dev.rodrigoramos.game_list.dto.GameListDTO;
import dev.rodrigoramos.game_list.entities.GameList;
import dev.rodrigoramos.game_list.repositories.GameListRepository;
import dev.rodrigoramos.game_list.repositories.GameMinProjection;
import dev.rodrigoramos.game_list.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }

    public void move (Long listId, int SourceIndex, int TargetIndex) {

        List<GameMinProjection> list = gameRepository.searchByList(listId);

        GameMinProjection obj

    }

}
