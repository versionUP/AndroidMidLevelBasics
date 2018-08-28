package com.example.akula.basicsproject.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.akula.basicsproject.Common.BaseFragment;
import com.example.akula.basicsproject.R;

public class FragmentInXml1 extends BaseFragment {

    @Override
    protected View onInflateFragmentLayout(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment1_layout,container,false);
    }
}
