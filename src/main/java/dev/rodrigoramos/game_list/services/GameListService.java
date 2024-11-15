package dev.rodrigoramos.game_list.services;

import dev.rodrigoramos.game_list.dto.GameListDTO;
import dev.rodrigoramos.game_list.entities.GameList;
import dev.rodrigoramos.game_list.repositories.GameListRepository;
import dev.rodrigoramos.game_list.projections.GameMinProjection;
import dev.rodrigoramos.game_list.repositories.GameRepository;
import jakarta.transaction.Transactional;
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

    @Transactional
    public void move(Long listId, int SourceIndex, int TargetIndex) {

        List<GameMinProjection> list = gameRepository.searchByList(listId);

        GameMinProjection obj = list.remove(SourceIndex);

        list.add(TargetIndex, obj);

        int min = Math.min(SourceIndex, TargetIndex);
        int max = Math.max(SourceIndex, TargetIndex);

        for (int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }

    }

}
