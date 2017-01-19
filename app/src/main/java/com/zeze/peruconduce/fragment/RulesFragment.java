package com.zeze.peruconduce.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zeze.peruconduce.R;
import com.zeze.peruconduce.adapter.RecyclerViewCardRulesAdapter;
import com.zeze.peruconduce.model.Rule;

import java.util.ArrayList;

public class RulesFragment extends Fragment {

    private RecyclerView recyclerView;
    private LinearLayoutManager manager;
    private RecyclerViewCardRulesAdapter adapter;

    public RulesFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rules, container, false);

        showToolbar("Reglamento", false, view);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview_rules);
        manager = new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        adapter = new RecyclerViewCardRulesAdapter(getData(),R.layout.card_rules, getActivity());
        recyclerView.setAdapter(adapter);

        return view;
    }

    public void showToolbar(String title, boolean upButton, View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(title);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

    private ArrayList<Rule> getData(){
        ArrayList<Rule> rules = new ArrayList<>();
        Rule r1 = new Rule(1,"Reglamento Nacional de Transito", R.drawable.img_road_rules);
        Rule r2 = new Rule(1,"Tipos de Placa", R.drawable.img_plate);
        Rule r3 = new Rule(1,"Tipos de Licencia", R.drawable.img_drivers_licence);

        rules.add(r1);
        rules.add(r2);
        rules.add(r3);

        return rules;
    }

}
