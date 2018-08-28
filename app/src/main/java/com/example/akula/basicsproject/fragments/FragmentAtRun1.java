package com.example.akula.basicsproject.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.akula.basicsproject.Activities.Main3Activity;
import com.example.akula.basicsproject.Common.BaseFragment;
import com.example.akula.basicsproject.R;



public class FragmentAtRun1 extends BaseFragment {

    public FragmentAtRun1() {
        // Required empty public constructor
    }

    @Override
    protected View onInflateFragmentLayout(LayoutInflater inflater, ViewGroup container) {
        _rootView = inflater.inflate(R.layout.fragment_fragment_at_run1, container, false);

        Button button = _rootView.findViewById(R.id.buttonRun1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Main3Activity.fragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, new FragmentAtRun2(), null)
                        .addToBackStack(null)  // For back nvigation
                        .commit();
            }
        });

        return _rootView;
    }
}
