package com.anandhu.rideShare.services;

import com.anandhu.rideShare.dto.DriverDto;
import com.anandhu.rideShare.dto.RideDto;
import com.anandhu.rideShare.dto.RideRequestDto;
import com.anandhu.rideShare.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);


    RiderDto rateRider(Long rideId, Integer rating);
    RideDto getMyProfile();

    List<RideDto> getAllMyRides();

}
