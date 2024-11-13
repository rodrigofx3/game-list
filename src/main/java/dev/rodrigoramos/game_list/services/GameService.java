package dev.rodrigoramos.game_list.services;

import dev.rodrigoramos.game_list.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;


}
