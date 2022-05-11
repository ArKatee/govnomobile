package com.example.mob.ViewModel;

import android.icu.util.BuddhistCalendar;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mob.EnterProfileFragment;
import com.example.mob.R;
import com.example.mob.databinding.FragmentEnterProfileBinding;

public class LogIn extends Fragment {
    private static authViewModel auth = new authViewModel();
    private static FragmentEnterProfileBinding binding;

    public LogIn() {}

    public static LogIn newInstance() { return new LogIn(); }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle saveInstanceState)  {
        return inflater.inflate(R.layout.fragment_enter_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding = FragmentEnterProfileBinding.bind(view);
    }

    public static boolean isOkay(){
        return auth.authentication(binding.editTextTextPersonName7.getText().toString(),
                binding.editTextTextPersonName11.getText().toString());
    }
}
