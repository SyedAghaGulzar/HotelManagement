package com.codentech.mars2.room.type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codentech.mars2.room.Room;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/room/type")
class RoomTypeController {
	
	@Autowired
	RoomTypeService rtService;
	
	@RequestMapping(method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getRoomTypes() {
		return new ResponseEntity<>(rtService.findAll(),HttpStatus.OK);
	}
	
	@RequestMapping(path="/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getRoomType(@PathVariable Integer id) {
		RoomType rt =rtService.findOne(id);
		if (rt == null)
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<>(rt,HttpStatus.FOUND);
	}
	
	@RequestMapping(method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RoomType> createRoomType(@RequestBody RoomType roomType ) {
		
		roomType=rtService.save(roomType);
		if (roomType == null)
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<>(roomType,HttpStatus.CREATED);
	}
	
	@RequestMapping(method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> updateRoomType(@RequestBody RoomType roomType ) {
		
		roomType=rtService.update(roomType);
		if (roomType == null)
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<>(roomType,HttpStatus.OK);
	}
	
	@RequestMapping(path="/{id}",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RoomType> deleteRoomType(@PathVariable Integer id) {
		rtService.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}		
}
