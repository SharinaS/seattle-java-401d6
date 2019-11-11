package com.ferreirae.buycheapstuff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BuyItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_item);

        // get the data added to the intent & use it to display this activity
        String itemName = getIntent().getStringExtra("item");

        // grab the label from the page
        TextView view = findViewById(R.id.textView);
        // set its text to be the item name
        view.setText("Buy the " + itemName);
    }
}
