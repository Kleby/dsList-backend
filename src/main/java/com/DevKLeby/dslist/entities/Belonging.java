package com.DevKLeby.dslist.entities;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "belonging ")
public class Belonging {

    private Integer position;

    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    public Belonging(){}

    public Belonging(Integer position, Game game, GameList list) {
        this.position = position;
        id.setGame(game);
        id.setList(list);
    }


}
