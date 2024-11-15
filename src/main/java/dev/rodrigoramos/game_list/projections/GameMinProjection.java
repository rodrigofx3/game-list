package dev.rodrigoramos.game_list.projections;

public interface GameMinProjection {

    Long getId();

    String getTitle();

    Integer getGameYear();

    String getImgUrl();

    String getShortDescription();

    String getPosition();

}
