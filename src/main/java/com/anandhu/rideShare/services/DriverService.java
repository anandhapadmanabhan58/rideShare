package com.anandhu.rideShare.services;

import com.anandhu.rideShare.dto.DriverDto;
import com.anandhu.rideShare.dto.RideDto;
import com.anandhu.rideShare.dto.RiderDto;
import com.anandhu.rideShare.entities.Ride;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);
    RideDto cancelRide(Long rideId);
    RideDto startRide(Long rideId);
    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);
    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();




}
