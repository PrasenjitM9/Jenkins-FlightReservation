package com.jeet.FlightReservation.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.jeet.FlightReservation.Model.Reservation;

@Component
public class PdfGenerator {
	public void generatePDF(Reservation reservation , String path)
	{
		Document document = new Document();
		
		try {
			PdfWriter.getInstance(document, new FileOutputStream(path));
			
			document.open();
			document.add(reservationData(reservation));
			document.close();
			
		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}
	}

	private PdfPTable reservationData(Reservation reservation) {
		
		PdfPTable table = new PdfPTable(2);
		PdfPCell cell;
		
		cell = new PdfPCell(new Phrase("Your Booking Details........."));
		cell.setColspan(2);
		table.addCell(cell);
		
		cell = new PdfPCell(new Phrase("Fight Details:-"));
		cell.setColspan(2);
		table.addCell(cell);
		
		table.addCell("Departure City");
		table.addCell(reservation.getFlight().getDepartureCity());
		
		table.addCell("Arrival City");
		table.addCell(reservation.getFlight().getArrivalCity());
		
		table.addCell("Flight Number");
		table.addCell(reservation.getFlight().getFlightNumber());
		
		table.addCell("Operating Airlines");
		table.addCell(reservation.getFlight().getOperatingAirlines());
		
		table.addCell("Date of Departure");
		table.addCell(reservation.getFlight().getDateOfDeparture().toString());
		
		table.addCell("Departure Time");
		table.addCell(reservation.getFlight().getEstimatedDepartureTime().toString());
		
		
		cell = new PdfPCell(new Phrase("Passenger Details:-"));
		cell.setColspan(2);
		table.addCell(cell);
		
		table.addCell("First Name");
		table.addCell(reservation.getPassenger().getFirstName());
		
		table.addCell("Last Name");
		table.addCell(reservation.getPassenger().getLastName());
		
		table.addCell("Middle Name");
		table.addCell(reservation.getPassenger().getMiddleName());
		
		table.addCell("Email Name");
		table.addCell(reservation.getPassenger().getEmail());
		
		table.addCell("Phone Name");
		table.addCell(reservation.getPassenger().getPhone());
		
		return table;
	}

}

