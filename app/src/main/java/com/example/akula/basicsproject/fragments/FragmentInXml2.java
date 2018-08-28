package com.example.akula.basicsproject.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.akula.basicsproject.Common.BaseFragment;
import com.example.akula.basicsproject.R;

public class FragmentInXml2 extends BaseFragment {


    @Override
    protected View onInflateFragmentLayout(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment2_layout,container,false);
    }
}
