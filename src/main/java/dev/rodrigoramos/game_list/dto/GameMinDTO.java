package dev.rodrigoramos.game_list.dto;

import dev.rodrigoramos.game_list.entities.Game;

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(Game entity) {

    }
}
