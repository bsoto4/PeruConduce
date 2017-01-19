package com.zeze.peruconduce.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.zeze.peruconduce.R;

public class SearchFragment extends Fragment {

    private EditText edtRules;

    public SearchFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        edtRules = (EditText) view.findViewById(R.id.edt_search);
        return view;
    }
}
