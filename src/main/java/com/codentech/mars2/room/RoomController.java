package com.codentech.mars2.room;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/room")
public class RoomController {

	@Autowired
	private RoomService roomService;
	
	@RequestMapping(method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Room>> getRooms() {
		return new ResponseEntity<List<Room>>(roomService.findAll(),HttpStatus.OK);
	}
	
	@RequestMapping(path="/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getRoom(@PathVariable Integer id,@RequestParam(required = false) Optional<?> data) throws JsonProcessingException {
		
		Room room = roomService.findOne(id,data);
		if (room == null)
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
		System.out.println(room);
		
		return new ResponseEntity<>(room,HttpStatus.FOUND);
	
	}
	
	@RequestMapping(method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Room> createRoom(@RequestBody Room room ) {
		
		room = roomService.save(room);
		
		if (room == null)
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<>(room,HttpStatus.CREATED);
	}
	
	@RequestMapping(method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Room> updateRoom(@RequestBody Room room ) {
		room = roomService.update(room);

		if (room == null)
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<>(room,HttpStatus.OK);
	}
	
	@RequestMapping(path="/{id}",method=RequestMethod.DELETE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Room> deleteRoom(@PathVariable Integer id) {

		roomService.delete(id);
		return new ResponseEntity<Room>(HttpStatus.NO_CONTENT);
	}
	
}
