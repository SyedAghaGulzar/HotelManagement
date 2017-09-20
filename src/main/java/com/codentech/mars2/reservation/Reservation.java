package com.codentech.mars2.reservation;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.Type;

import com.codentech.mars2.customer.Customer;
import com.codentech.mars2.employee.Employee;
import com.codentech.mars2.room.Room;
import com.codentech.mars2.roomtype.RoomType;

@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;

	private Customer customerId;

	private Room roomId;

	private RoomType roomTypeId;

	private Employee employeeId;

	// cnic or passport no
	private String cnicNo;
	
	private String guestName2;
	
	private String guestName3;

	private String type;

	private String company;

	/*// Change String to PaymentType
	private String paymentType;*/

	// Active or not
	private String status;

	private LocalDate resDate;

	private LocalDate checkinDate;

	private LocalDate checkoutDate;

	private LocalTime checkinTime;

	private LocalTime checkoutTime;

	private String btcId;

	// like res Id
	private String groupId;

	private double roomRate;

	// cash,btc etc
	private String billing;

	private int noOfGuests;

	// no of nights
	private int nights;

	private String source;

	private String newsPaper;

	// List of meals bf,lunch etc
	private String meals;

	private String resNotes;

	private String checkInNotes;

	private String discount;

	private String nation;

	private String region;

	private String reference;

	private String purpose;

	private boolean pickup;

	// List of stations
	private String pickupStation;

	private String pickupCarrier;

	private LocalTime pickupTime;

	private boolean drop;

	// List of stations
	private String dropStation;

	private String dropCarrier;

	private LocalTime dropTime;

	private String fbCredits;

	private LocalDate lastCheckout;

	@Type(type = "yes_no")
	private Boolean isActive;

	@Type(type = "yes_no")
	private Boolean isDeleted;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public Room getRoomId() {
		return roomId;
	}

	public void setRoomId(Room roomId) {
		this.roomId = roomId;
	}

	public RoomType getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(RoomType roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public Employee getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Employee employeeId) {
		this.employeeId = employeeId;
	}

	public String getCnicNo() {
		return cnicNo;
	}

	public void setCnicNo(String cnicNo) {
		this.cnicNo = cnicNo;
	}

	public String getGuestName2() {
		return guestName2;
	}

	public void setGuestName2(String guestName2) {
		this.guestName2 = guestName2;
	}

	public String getGuestName3() {
		return guestName3;
	}

	public void setGuestName3(String guestName3) {
		this.guestName3 = guestName3;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getResDate() {
		return resDate;
	}

	public void setResDate(LocalDate resDate) {
		this.resDate = resDate;
	}

	public LocalDate getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(LocalDate checkinDate) {
		this.checkinDate = checkinDate;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public LocalTime getCheckinTime() {
		return checkinTime;
	}

	public void setCheckinTime(LocalTime checkinTime) {
		this.checkinTime = checkinTime;
	}

	public LocalTime getCheckoutTime() {
		return checkoutTime;
	}

	public void setCheckoutTime(LocalTime checkoutTime) {
		this.checkoutTime = checkoutTime;
	}

	public String getBtcId() {
		return btcId;
	}

	public void setBtcId(String btcId) {
		this.btcId = btcId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public double getRoomRate() {
		return roomRate;
	}

	public void setRoomRate(double roomRate) {
		this.roomRate = roomRate;
	}

	public String getBilling() {
		return billing;
	}

	public void setBilling(String billing) {
		this.billing = billing;
	}

	public int getNoOfGuests() {
		return noOfGuests;
	}

	public void setNoOfGuests(int noOfGuests) {
		this.noOfGuests = noOfGuests;
	}

	public int getNights() {
		return nights;
	}

	public void setNights(int nights) {
		this.nights = nights;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getNewsPaper() {
		return newsPaper;
	}

	public void setNewsPaper(String newsPaper) {
		this.newsPaper = newsPaper;
	}

	public String getMeals() {
		return meals;
	}

	public void setMeals(String meals) {
		this.meals = meals;
	}

	public String getResNotes() {
		return resNotes;
	}

	public void setResNotes(String resNotes) {
		this.resNotes = resNotes;
	}

	public String getCheckInNotes() {
		return checkInNotes;
	}

	public void setCheckInNotes(String checkInNotes) {
		this.checkInNotes = checkInNotes;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public boolean isPickup() {
		return pickup;
	}

	public void setPickup(boolean pickup) {
		this.pickup = pickup;
	}

	public String getPickupStation() {
		return pickupStation;
	}

	public void setPickupStation(String pickupStation) {
		this.pickupStation = pickupStation;
	}

	public String getPickupCarrier() {
		return pickupCarrier;
	}

	public void setPickupCarrier(String pickupCarrier) {
		this.pickupCarrier = pickupCarrier;
	}

	public LocalTime getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(LocalTime pickupTime) {
		this.pickupTime = pickupTime;
	}

	public boolean isDrop() {
		return drop;
	}

	public void setDrop(boolean drop) {
		this.drop = drop;
	}

	public String getDropStation() {
		return dropStation;
	}

	public void setDropStation(String dropStation) {
		this.dropStation = dropStation;
	}

	public String getDropCarrier() {
		return dropCarrier;
	}

	public void setDropCarrier(String dropCarrier) {
		this.dropCarrier = dropCarrier;
	}

	public LocalTime getDropTime() {
		return dropTime;
	}

	public void setDropTime(LocalTime dropTime) {
		this.dropTime = dropTime;
	}

	public String getFbCredits() {
		return fbCredits;
	}

	public void setFbCredits(String fbCredits) {
		this.fbCredits = fbCredits;
	}

	public LocalDate getLastCheckout() {
		return lastCheckout;
	}

	public void setLastCheckout(LocalDate lastCheckout) {
		this.lastCheckout = lastCheckout;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	

}