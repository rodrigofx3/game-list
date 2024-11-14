package dev.rodrigoramos.game_list.repositories;

import dev.rodrigoramos.game_list.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
