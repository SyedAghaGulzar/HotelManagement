package com.codentech.mars2.room;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codentech.mars2.room.type.RoomTypeService;

@Service
public class RoomService {

	@Autowired
	private RoomRepository roomRepo;

	@Autowired
	private RoomTypeService rtService;
	
	public List<Room> findAll() {
		return roomRepo.findAll();
	}

	//@Transactional(readOnly=true)
	public Room findOne(Integer id, Optional<?> data) {
		
		Room room = roomRepo.findOne(id);
		
		if(room !=null && data.isPresent()) {
			room.set__roomType(rtService.findOne(room.getRoomTypeId()));
		}

		return room;
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
