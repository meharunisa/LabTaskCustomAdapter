package com.example.madamkinza.myadapter;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.util.List;
public class UserAdapter extends ArrayAdapter<User> {
    public UserAdapter(@NonNull Context context, @NonNull List<User> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.user_item_list,parent,false);
        User u = getItem(position);

        TextView tvUserName = (TextView) view.findViewById(R.id.tvUserName);
        TextView tvRollNumber = (TextView) view.findViewById(R.id.tvRollNumber);

        tvUserName.setText(u.getUsername());
        tvRollNumber.setText(u.getRollnumber());

        return view;
    }
