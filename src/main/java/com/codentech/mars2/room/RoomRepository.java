package com.codentech.mars2.room;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Integer>{

	/*@Query("From Room r join fetch r.roomType where r.id = ?1")
	public Room findOneEL(Integer id);*/
	
}
