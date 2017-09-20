package com.codentech.mars2.roomtype;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomTypeService {

	@Autowired
	private RoomTypeRepository roomTypeRepository;
	
	public List<RoomType> findAll() {
		return roomTypeRepository.findAll();
	}

	public RoomType findOne(Integer id) {
		return roomTypeRepository.findOne(id);
	}

	public RoomType save(RoomType roomType) {
		
		if (roomType.getId() != null) {
			// cannot create room with given id value
			return null;
		}
		return roomTypeRepository.save(roomType);
		
	}
	
	public RoomType update(RoomType roomType) {
		
		if(findOne(roomType.getId()) == null) {
			// cannot update room with missing id value
			return null;
		}	
		return roomTypeRepository.save(roomType);
		
	}
	
	public void delete(Integer id) {
		roomTypeRepository.delete(id);
	}
}
