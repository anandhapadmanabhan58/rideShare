package com.anandhu.rideShare.strategies;

import com.anandhu.rideShare.dto.RideRequestDto;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);

}
