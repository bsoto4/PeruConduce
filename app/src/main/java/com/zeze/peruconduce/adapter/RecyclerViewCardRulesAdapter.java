package com.zeze.peruconduce.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.zeze.peruconduce.R;
import com.zeze.peruconduce.model.Rule;

import java.util.ArrayList;

/**
 * Created by Bryam Soto on 18/01/2017.
 */

public class RecyclerViewCardRulesAdapter extends RecyclerView.Adapter<RecyclerViewCardRulesAdapter.CardRulesViewHolder> {

    private ArrayList<Rule> rules;
    private int resource;
    private Activity activity;

    public RecyclerViewCardRulesAdapter(ArrayList<Rule> rules, int resource, Activity activity) {
        this.rules = rules;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public CardRulesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return new CardRulesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CardRulesViewHolder holder, int position) {
        Rule rule = rules.get(position);
        holder.tvTitleRules.setText(rule.getName());
        Picasso.with(activity.getBaseContext()).load(rule.getImgId()).into(holder.imgCardRules);
    }

    @Override
    public int getItemCount() {
        return rules.size();
    }

    public class CardRulesViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgCardRules;
        private TextView tvTitleRules;

        public CardRulesViewHolder(View view) {
            super(view);

            imgCardRules = (ImageView) view.findViewById(R.id.img_card_rules);
            tvTitleRules = (TextView) view.findViewById(R.id.tv_title_rules);
        }
    }
}
