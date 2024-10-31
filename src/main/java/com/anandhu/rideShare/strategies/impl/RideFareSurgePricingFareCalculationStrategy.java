package com.anandhu.rideShare.strategies.impl;

import com.anandhu.rideShare.dto.RideRequestDto;
import com.anandhu.rideShare.strategies.RideFareCalculationStrategy;

public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
