package dev.rodrigoramos.game_list.repositories;

public interface GameMinProjection {

    Long getId();

    String getTitle();

    Integer getGameYear();

    String getImgUrl();

    String getShortDescription();

}
