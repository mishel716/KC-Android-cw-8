package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Bundle bundle =getIntent().getExtras();

        Item delItem=(Item) bundle.getSerializable("Phone");
        TextView price =findViewById(R.id.brand);
        TextView name = findViewById(R.id.namww);
        TextView desi = findViewById(R.id.desi);
        ImageView img = findViewById(R.id.imageView);

        desi.setText(delItem.getItemdes());
        price.setText(String.valueOf(delItem.getItemPrice()));
        name.setText(delItem.getItemName());
        img.setImageResource(delItem.getItemImg());



    }
}