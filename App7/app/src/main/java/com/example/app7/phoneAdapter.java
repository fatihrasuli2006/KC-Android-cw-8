package com.example.app7;

import androidx.annotation.NonNull;

import java.util.ArrayList;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import java.util.List;

public class phoneAdapter extends ArrayAdapter {
    List<phone> phoneList;
    public phoneAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        phoneList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        phone currentPhone = phoneList.get(position);

        TextView phoneNameTextView = view.findViewById(R.id.phoneName);
        TextView phoneBrandTextView = view.findViewById(R.id.phoneBrand);
        ImageView phoneImageView = view.findViewById(R.id.phoneImage);

        phoneNameTextView.setText(currentPhone.getPhoneName());
        phoneBrandTextView.setText(currentPhone.getPhoneBrand());
        phoneImageView.setImageResource(currentPhone.getPhoneImage());

        ImageView deleteBtn = view.findViewById(R.id.deleteButton);

        deleteBtn.setOnClickListener(new View.OnClickListener() {
            phone removephone = phoneList.get(position);
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext()).setMessage("هل أنت متأكد من أنك تريد حذف العنصر؟")
                        .setTitle("Confirmation").setPositiveButton("Delete", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                phoneList.remove(removephone);
                                notifyDataSetChanged();
                            }
                        }).setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });
                builder.show();
            }
        });

        return view;

    }
}

