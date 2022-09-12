package com.example.demo.auth;

import java.util.Optional;

public interface ApplicationUserDao {

    Optional<AppUser> selectApplicationUserByUsername(String username);

}
