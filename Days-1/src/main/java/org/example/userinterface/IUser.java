package org.example.userinterface;

import java.util.Optional;

public interface IUser extends IBase  {

    Optional<User> userLogin(String email, String password );
    Optional<User> userUpdate( User user );
}
