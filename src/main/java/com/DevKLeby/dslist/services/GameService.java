package com.DevKLeby.dslist.services;

import com.DevKLeby.dslist.DTO.GameDTO;
import com.DevKLeby.dslist.DTO.GameMinDTO;
import com.DevKLeby.dslist.entities.Game;
import com.DevKLeby.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findALl(){
        List<GameMinDTO> result = gameRepository.findAll().stream().map(g -> new GameMinDTO(g)).toList();
        return result;
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }
}
