package com.anandhu.rideShare.strategies;

import com.anandhu.rideShare.dto.RideRequestDto;
import com.anandhu.rideShare.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

     List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
