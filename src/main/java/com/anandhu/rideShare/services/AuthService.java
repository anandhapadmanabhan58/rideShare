package com.anandhu.rideShare.services;

import com.anandhu.rideShare.dto.DriverDto;
import com.anandhu.rideShare.dto.SignupDto;
import com.anandhu.rideShare.dto.UserDto;

public interface AuthService {

    String login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onBoardNewDriver(Long userId);
}
