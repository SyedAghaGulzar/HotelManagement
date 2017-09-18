package com.codentech.mars2.room;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

	@Autowired
	private RoomRepository roomRepository;
	
	public List<Room> findAll() {
		return roomRepository.findAll();
	}

	public Room findOne(Integer id) {
		return roomRepository.findOne(id);
	}

	public Room save(Room room) {
		
		if (room.getId() != null) {
			// cannot create room with given id value
			return null;
		}
		return roomRepository.save(room);
		
	}
	
	public Room update(Room room) {
		
		if(findOne(room.getId()) == null) {
			// cannot update room with missing id value
			return null;
		}	
		return roomRepository.save(room);
		
	}
	
	public void delete(Integer id) {
		roomRepository.delete(id);
	}
}
