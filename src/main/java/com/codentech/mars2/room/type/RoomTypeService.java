package com.codentech.mars2.room.type;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomTypeService {

	@Autowired
	private RoomTypeRepository rtRepo;

	public List<RoomType> findAll() {
		return rtRepo.findAll();
	}

	public RoomType findOne(Integer id) {
		return rtRepo.findOne(id);
	}

	public RoomType save(RoomType roomType) {

		if (roomType.getId() != null) {
			// cannot create room with given id value
			return null;
		}
		return rtRepo.save(roomType);

	}

	public RoomType update(RoomType roomType) {

		if (findOne(roomType.getId()) == null) {
			// cannot update room with missing id value
			return null;
		}
		return rtRepo.save(roomType);

	}

	public void delete(Integer id) {
		
		//if (rtRepo.exists(id)) {	
			rtRepo.delete(id);
		//	return true;
		//}
		
		//return false;
	}

}
