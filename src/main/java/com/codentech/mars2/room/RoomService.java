package com.codentech.mars2.room;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoomService {

	@Autowired
	private RoomRepository roomRepo;

	public List<Room> findAll() {
		return roomRepo.findAll();
	}

	//@Transactional(readOnly=true)
	public Room findOne(Integer id, Optional<?> data) {
		
		if(data.isPresent()) {
			return roomRepo.findOneEL(id);
		}

		return roomRepo.findOne(id);
	}

	public Room save(Room room) {
		if (room.getId() != null) {
			return null;
		}
		return roomRepo.save(room);
	}

	public Room update(Room room) {
		if (!roomRepo.exists(room.getId())) {
			return null;
		}
		return roomRepo.save(room);
	}

	public void delete(Integer id) {
		roomRepo.delete(id);
	}
}
