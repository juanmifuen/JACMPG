package com.Hotel.Hotel.service.interfac;


import com.Hotel.Hotel.dto.Response;
import com.Hotel.Hotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
