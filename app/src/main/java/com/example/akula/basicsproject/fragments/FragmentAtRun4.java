package com.example.akula.basicsproject.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.akula.basicsproject.R;


public class FragmentAtRun4 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private onMessageReadListener listener;



    public interface onMessageReadListener {
        void onMessageReadListener(String messsage);
    }


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentAtRun4() {
        // Required empty public constructor
    }


    public static FragmentAtRun4 newInstance(String param1, String param2) {
        FragmentAtRun4 fragment = new FragmentAtRun4();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            View view =  inflater.inflate(R.layout.fragment_fragment_at_run4, container, false);

        final EditText editText = (EditText)view.findViewById(R.id.editTextInFourthFrag);
        Button button = (Button)view.findViewById(R.id.buttonInFourthFrag);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String e =editText.getText().toString();

                listener.onMessageReadListener(e);
            }
        });

        return view;
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
