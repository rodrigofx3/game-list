package dev.rodrigoramos.game_list.repositories;

public interface GameMinProjection {

    Long getId();

    String getTitle();

    Integer getYear();

    String getImgUrl();

    String getShortDescription();

    Integer getPosition();

}
