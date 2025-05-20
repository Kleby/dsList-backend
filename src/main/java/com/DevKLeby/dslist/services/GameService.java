package com.DevKLeby.dslist.services;

import com.DevKLeby.dslist.DTO.GameMinDTO;
import com.DevKLeby.dslist.entities.Game;
import com.DevKLeby.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public List<GameMinDTO> findALl(){
        List<GameMinDTO> result = gameRepository.findAll().stream().map(g -> new GameMinDTO(g)).toList();
        return result;
    }
}
