package com.example.akula.basicsproject.fragments;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
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

public class FragmentAtRun5 extends BaseFragment {

    private  EditText editTextOnFifthFrag;
    private onMessageReadListener listener;

    public interface onMessageReadListener {
         void onMessageRead(String message);

    }
    public FragmentAtRun5() {
        // Required empty public constructor
    }

 
    @Override
    protected View onInflateFragmentLayout(LayoutInflater inflater, ViewGroup container) {

        _rootView = inflater.inflate(R.layout.fragment_fragment_at_run5, container, false);
        editTextOnFifthFrag = (EditText)_rootView.findViewById(R.id.editTextInFifthhFrag);
        Button button =(Button)_rootView.findViewById(R.id.buttonInFifthFrag);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = editTextOnFifthFrag.getText().toString();
                listener.onMessageRead(message);

            }
        });
        return _rootView;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Activity  activity =(Activity)context;

        try{
            listener =(onMessageReadListener)activity;
        }catch(ClassCastException e){
            throw  new ClassCastException(activity.toString() + "must overide onMessgeRead");
        }
    }


    @Override
    public void onResume() {
        super.onResume();
       editTextOnFifthFrag.setText("");
    }
}
