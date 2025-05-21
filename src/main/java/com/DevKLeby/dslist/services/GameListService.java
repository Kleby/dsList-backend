package com.DevKLeby.dslist.services;

import com.DevKLeby.dslist.DTO.GameDTO;
import com.DevKLeby.dslist.DTO.GameListDTO;
import com.DevKLeby.dslist.entities.GameList;
import com.DevKLeby.dslist.repositories.GameListRepository;
import com.DevKLeby.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map( l -> new GameListDTO(l)).toList();
    }

}
