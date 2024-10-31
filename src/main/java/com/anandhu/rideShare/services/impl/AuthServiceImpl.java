package com.anandhu.rideShare.services.impl;

import com.anandhu.rideShare.dto.DriverDto;
import com.anandhu.rideShare.dto.SignupDto;
import com.anandhu.rideShare.dto.UserDto;
import com.anandhu.rideShare.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onBoardNewDriver(Long userId) {
        return null;
    }
}
