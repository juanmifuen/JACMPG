package com.Hotel.Hotel.service.interfac;


import com.Hotel.Hotel.dto.LoginRequest;
import com.Hotel.Hotel.dto.Response;
import com.Hotel.Hotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}