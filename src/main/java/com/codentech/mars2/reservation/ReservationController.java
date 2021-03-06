package com.codentech.mars2.reservation;

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

import com.codentech.mars2.customer.Customer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import play.libs.Json;



@RestController
@RequestMapping("/reservation")
public class ReservationController {

	@Autowired
	private ReservationService reservationService;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Reservation>> getReservations() {
		return new ResponseEntity<List<Reservation>>(reservationService.findAll(), HttpStatus.OK);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Reservation> getReservation(@PathVariable Long id) {

		Reservation reservation = reservationService.findOne(id);
		if (reservation == null)
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

		return new ResponseEntity<Reservation>(reservation, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createReservation(@RequestBody JsonNode jsonNode) {

		Reservation reservation = reservationService.save(jsonNode);

		if (reservation == null)
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		return new ResponseEntity<>(reservation, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> updateReservation(@RequestBody JsonNode jsonNode) {

		Reservation reservation = reservationService.update(jsonNode);
		if (reservation == null)
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		return new ResponseEntity<>(reservation, HttpStatus.OK);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Reservation> deleteReservation(@PathVariable Long id) {

		reservationService.delete(id);
		return new ResponseEntity<Reservation>(HttpStatus.NO_CONTENT);
	}
	
/*	public ResponseEntity<Reservation> deleteReservation(@RequestBody JsonNode data) {
		
		data.findPath("guest").findPath("id").asInt();
		Json.fromJson(data.findPath("guest"), Customer.class);
//		Json.toJson(new Customer(1));
		ObjectNode objectNode = Json.newObject();
		objectNode.set("room", Json.toJson(new Customer()));
		objectNode.set("room2", Json.toJson(new Customer()));
		Json.stringify(objectNode);
				
		return new ResponseEntity<>("{ \"room1\": "+ new ObjectMapper().writeValueAsString(roomService.findOne(1))+","
				+ "\"roomType\":" + new ObjectMapper().writeValueAsString(roomService.findOne(1)) + ","
				+ "}",HttpStatus.OK);
	}*/
	
	
}
