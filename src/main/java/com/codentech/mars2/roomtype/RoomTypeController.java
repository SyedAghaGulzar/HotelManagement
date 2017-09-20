package com.codentech.mars2.roomtype;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roomtype")
public class RoomTypeController {

	@Autowired
	private RoomTypeService roomTypeService;
	
	@RequestMapping(method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<RoomType>> getRoomTypes() {
		return new ResponseEntity<List<RoomType>>(roomTypeService.findAll(),HttpStatus.OK);
	}
	
	@RequestMapping(path="/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RoomType> getRoomType(@PathVariable Integer id) {
		
		RoomType roomType = roomTypeService.findOne(id);
		if (roomType == null)
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<RoomType>(roomType,HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RoomType> createRoomType(@RequestBody RoomType roomType ) {
		
		roomType = roomTypeService.save(roomType);
		
		if (roomType == null)
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		return new ResponseEntity<>(roomType,HttpStatus.CREATED);
	}
	
	@RequestMapping(method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RoomType> updateRoomType(@RequestBody RoomType roomType ) {
		System.out.println(roomType);
		roomType = roomTypeService.update(roomType);
		System.out.println("\n\n"+roomType);
		if (roomType == null)
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		
		return new ResponseEntity<>(roomType,HttpStatus.OK);
	}
	
	@RequestMapping(path="/{id}",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RoomType> deleteRoomType(@PathVariable Integer id) {

		roomTypeService.delete(id);
		return new ResponseEntity<RoomType>(HttpStatus.NO_CONTENT);
	}
}
