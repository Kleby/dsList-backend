package com.DevKLeby.dslist.repositories;

import com.DevKLeby.dslist.Projections.GameMinProjection;
import com.DevKLeby.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true, value = """
		SELECT 
			games.id, 
			games.title, 
			games.game_year AS gameYear, 
			games.img_url AS imgUrl,
			games.short_description AS shortDescription, 
			belonging.position
		FROM games
		INNER JOIN belonging ON games.id = belonging.game_id
		WHERE belonging.game_list_id = :listId
		ORDER BY belonging.position
			""")
    List<GameMinProjection> searchByList(Long listId);
}
