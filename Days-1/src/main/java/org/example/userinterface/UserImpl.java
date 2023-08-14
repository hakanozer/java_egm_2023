package org.example.userinterface;

import java.util.Optional;

public class UserImpl implements IUser, IAddress {

    @Override
    public Optional<User> userLogin(String email, String password) {
        return Optional.empty();
    }

    @Override
    public Optional<User> userUpdate(User user) {
        return Optional.empty();
    }

    @Override
    public String getUserAddress(long userID) {
        return null;
    }

    @Override
    public boolean userControl(String email) {
        return false;
    }
}
