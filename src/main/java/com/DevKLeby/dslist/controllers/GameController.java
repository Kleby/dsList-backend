package com.DevKLeby.dslist.controllers;

import com.DevKLeby.dslist.DTO.GameDTO;
import com.DevKLeby.dslist.DTO.GameMinDTO;
import com.DevKLeby.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findALl();
        return result;
    }
    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        try {
            GameDTO result = gameService.findById(id);
            return result;
        }catch (Exception e){
            System.out.println("Id não encontrado");
            e.getMessage();
            return null;
        }

    }

}
