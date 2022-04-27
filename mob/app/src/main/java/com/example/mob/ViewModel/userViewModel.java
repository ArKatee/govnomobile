package com.example.mob.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mob.model.User;
import com.example.mob.repository.userRepo;

public class userViewModel extends ViewModel {
    private MutableLiveData<User> mUser = new MutableLiveData<>();
    private userRepo repo;

    public void setData(User user) { mUser.setValue(user); }

    public MutableLiveData<User> getmUser() {return mUser; }
}
