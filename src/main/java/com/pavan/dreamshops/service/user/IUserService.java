package com.pavan.dreamshops.service.user;

import com.pavan.dreamshops.dto.UserDto;
import com.pavan.dreamshops.model.User;
import com.pavan.dreamshops.request.CreateUserRequest;
import com.pavan.dreamshops.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
