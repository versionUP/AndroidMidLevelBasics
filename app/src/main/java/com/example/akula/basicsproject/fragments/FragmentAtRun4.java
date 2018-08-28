package com.example.akula.basicsproject.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.akula.basicsproject.Common.BaseFragment;
import com.example.akula.basicsproject.R;


public class FragmentAtRun4 extends BaseFragment {

    private onMessageReadListener listener;



    public interface onMessageReadListener {
        void onMessageReadListener(String messsage);
    }


    public FragmentAtRun4() {
        // Required empty public constructor
    }


    @Override
    protected View onInflateFragmentLayout(LayoutInflater inflater, ViewGroup container) {

        _rootView =  inflater.inflate(R.layout.fragment_fragment_at_run4, container, false);
        final EditText editText = (EditText)_rootView.findViewById(R.id.editTextInFourthFrag);
        Button button = (Button)_rootView.findViewById(R.id.buttonInFourthFrag);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String e =editText.getText().toString();

                listener.onMessageReadListener(e);
            }
        });


        return _rootView;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Activity activity = (Activity)context;
        try {
            listener = (onMessageReadListener)activity;
        } catch (ClassCastException e){
            throw new ClassCastException(activity.toString() + "must override the mthod onmessage override");
        }

    }
}
