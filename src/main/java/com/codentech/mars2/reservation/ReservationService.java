package com.codentech.mars2.reservation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

	@Autowired
	private ReservationRepository reservationRepository;
	
	public List<Reservation> findAll() {
		return reservationRepository.findAll();
	}

	public Reservation findOne(Integer id) {
		return reservationRepository.findOne(id);
	}

	public Reservation save(Reservation reservation) {
		
		if (reservation.getId() != null) {
			// cannot create room with given id value
			return null;
		}
		return reservationRepository.save(reservation);
		
	}
	
	public Reservation update(Reservation reservation) {
		
		if(findOne(reservation.getId()) == null) {
			// cannot update room with missing id value
			return null;
		}	
		return reservationRepository.save(reservation);
		
	}
	
	public void delete(Integer id) {
		reservationRepository.delete(id);
	}
}
