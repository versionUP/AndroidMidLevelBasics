package com.example.akula.basicsproject.Common;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment {

   protected View _rootView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        Bundle extras = initializeBundle(savedInstanceState);
        if (extras !=null){
            initializeFromBundle(extras);
        }

        _rootView = onInflateFragmentLayout(inflater,container);
        return _rootView;
    }

    protected  void initializeFromBundle(Bundle bundle){}

    protected void saveInstanceToBundle(Bundle savedInstanceState){}

    @Override
    public void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        saveInstanceToBundle(savedInstanceState);
        super.onSaveInstanceState(savedInstanceState);
    }

    private Bundle initializeBundle(Bundle savedInstanceState) {
       return  initializeBundle(savedInstanceState,this);
    }

    private static Bundle initializeBundle(Bundle savedInstanceState,Fragment fragment) {
        Bundle extras = savedInstanceState;
        if(extras ==null){
          extras = fragment.getArguments();
        }
            return extras;
    }


    protected abstract View onInflateFragmentLayout(android.view.LayoutInflater inflater, android.view.ViewGroup container);
}
