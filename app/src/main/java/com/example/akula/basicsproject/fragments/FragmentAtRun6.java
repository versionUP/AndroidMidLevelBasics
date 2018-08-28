package com.example.akula.basicsproject.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.akula.basicsproject.Common.BaseFragment;
import com.example.akula.basicsproject.R;


public class FragmentAtRun6 extends BaseFragment {


    private TextView  textView;

    public FragmentAtRun6() {
        // Required empty public constructor
    }

    @Override
    protected View onInflateFragmentLayout(LayoutInflater inflater, ViewGroup container) {
        _rootView = inflater.inflate(R.layout.fragment_fragment_at_run6, container, false);

        textView = (TextView)_rootView.findViewById(R.id.textViewInSixFrag);

        Bundle  bundle = getArguments();
        String message = bundle!=null ? bundle.getString("message"):"";
        textView.setText(message);

        return _rootView;
    }


}
