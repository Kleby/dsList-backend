package com.DevKLeby.dslist.DTO;

import com.DevKLeby.dslist.entities.Game;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameMinDTO {

    private Long id;
    private String title;

    private  Integer year;
    private String imgUrl;

    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entety) {
        id = entety.getId();
        title = entety.getTitle();
        year = entety.getYear();
        imgUrl = entety.getImgUrl();
        shortDescription = entety.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
