package com.DevKLeby.dslist.DTO;

import com.DevKLeby.dslist.Projections.GameMinProjection;
import com.DevKLeby.dslist.entities.Game;

public class GameMinDTO {

    private Long id;
    private String title;

    private  Integer gameYear;
    private String imgUrl;

    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entety) {
        id = entety.getId();
        title = entety.getTitle();
        gameYear = entety.getYear();
        imgUrl = entety.getImgUrl();
        shortDescription = entety.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projection){
        id = projection.getId();
        title = projection.getTitle();
        gameYear = projection.getGameYear();
        imgUrl = projection.getImgUrl();
        shortDescription = getShortDescription();
    }


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getGameYear() {
        return gameYear;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
