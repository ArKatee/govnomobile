package com.example.mob.ViewModel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.mob.model.User;
import com.example.mob.repository.userRepo;

public class authViewModel extends ViewModel {
    userRepo repo = new userRepo();
    static User nUser = new User();

    public authViewModel() {}

    public boolean authentication( String name, String password){
        User mUser = repo.getUserByName(name);
        if (mUser != null) {
            Log.i("DEBAGTAG", mUser.getPassword() + "/" + password);
            if (mUser.getPassword().equals(password)) {
                nUser = mUser;
                return true;
            }
        }
        return false;
    }

    public static User giveUser() {
        return nUser;
    }
}
