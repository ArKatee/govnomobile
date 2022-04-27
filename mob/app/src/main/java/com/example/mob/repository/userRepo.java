package com.example.mob.repository;

import android.os.Build;

import com.example.mob.model.User;

import java.util.ArrayList;
import java.util.List;

public class userRepo {
    public static List<User> userSet = new ArrayList<>();

    public userRepo() {
        User user = new User();
        user.setNickname("ArKate");
        user.setEmail("arkate@yandex.ru");
        user.setPassword("123456");
        user.setPhone("89265551515");
        addUser(user);
    }

    public void addUser(User user) { userSet.add(user); }

    public User getUserByName(String name) {
        User result = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            try {
                result = userSet.stream().filter(user -> user.getNickname().equals(name)).findFirst().get();
            } catch (Exception e) {

            }
        }
        return result;
    }
}
