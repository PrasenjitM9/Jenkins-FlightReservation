package com.jeet.FlightReservation.DTO;

public class ReservationRequest {

	private String passenggerFirstName;
	private String passenggerLastName;
	private String passenggerMiddleName;
	private String passenggerEmail;
	private String passenggerPhone;

	private String passenggerCardName;
	private String passenggerCardNumber;
	private String passenggerExpireDate;
	private String passenggerSecureCode;

	private int flightId;

	@Override
	public String toString() {
		return "ReservationRequest [passenggerFirstName=" + passenggerFirstName + ", passenggerLastName="
				+ passenggerLastName + ", passenggerMiddleName=" + passenggerMiddleName + ", passenggerEmail="
				+ passenggerEmail + ", passenggerPhone=" + passenggerPhone + ", passenggerCardName="
				+ passenggerCardName + ", passenggerCardNumber=" + passenggerCardNumber + ", passenggerExpireDate="
				+ passenggerExpireDate + ", passenggerSecureCode=" + passenggerSecureCode + ", flightId=" + flightId
				+ "]";
	}

	public String getPassenggerFirstName() {
		return passenggerFirstName;
	}

	public void setPassenggerFirstName(String passenggerFirstName) {
		this.passenggerFirstName = passenggerFirstName;
	}

	public String getPassenggerLastName() {
		return passenggerLastName;
	}

	public void setPassenggerLastName(String passenggerLastName) {
		this.passenggerLastName = passenggerLastName;
	}

	public String getPassenggerMiddleName() {
		return passenggerMiddleName;
	}

	public void setPassenggerMiddleName(String passenggerMiddleName) {
		this.passenggerMiddleName = passenggerMiddleName;
	}

	public String getPassenggerEmail() {
		return passenggerEmail;
	}

	public void setPassenggerEmail(String passenggerEmail) {
		this.passenggerEmail = passenggerEmail;
	}

	public String getPassenggerPhone() {
		return passenggerPhone;
	}

	public void setPassenggerPhone(String passenggerPhone) {
		this.passenggerPhone = passenggerPhone;
	}

	public String getPassenggerCardName() {
		return passenggerCardName;
	}

	public void setPassenggerCardName(String passenggerCardName) {
		this.passenggerCardName = passenggerCardName;
	}

	public String getPassenggerCardNumber() {
		return passenggerCardNumber;
	}

	public void setPassenggerCardNumber(String passenggerCardNumber) {
		this.passenggerCardNumber = passenggerCardNumber;
	}

	public String getPassenggerExpireDate() {
		return passenggerExpireDate;
	}

	public void setPassenggerExpireDate(String passenggerExpireDate) {
		this.passenggerExpireDate = passenggerExpireDate;
	}

	public String getPassenggerSecureCode() {
		return passenggerSecureCode;
	}

	public void setPassenggerSecureCode(String passenggerSecureCode) {
		this.passenggerSecureCode = passenggerSecureCode;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

}
