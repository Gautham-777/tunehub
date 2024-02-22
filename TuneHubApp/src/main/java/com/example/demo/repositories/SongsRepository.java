package com.example.demo.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Songs;
import com.example.demo.entities.Users;

public interface SongsRepository extends JpaRepository<Songs , Integer> {

	
	
	public Songs findByName(String name);

	List<Songs> findByNameIgnoreCase(String keyword);

}
