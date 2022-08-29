package com.example.app7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.details_activity);super.onCreate(savedInstanceState);

            Bundle bundle = getIntent().getExtras();
            phone delieveredPhone = (phone) bundle.getSerializable("phone");

        TextView phoneNameTextView = findViewById(R.id.phoneNameTextView2);
        TextView phoneBrandTextView = findViewById(R.id.phoneDetailsTextView2);
        ImageView phoneImageView = findViewById(R.id.phoneImageView2);

        phoneNameTextView.setText(delieveredPhone.getPhoneName());
        phoneBrandTextView.setText(delieveredPhone.getPhoneBrand());
        phoneImageView.setImageResource(delieveredPhone.getPhoneImage());


    }
}