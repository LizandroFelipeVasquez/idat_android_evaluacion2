package com.example.android_evaluacion2;

import androidx.fragment.app.Fragment;


public interface NavigationHost {
    void navigateTo (Fragment fragment,Boolean addToBackstack );
}