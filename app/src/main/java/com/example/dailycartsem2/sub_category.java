package com.example.dailycartsem2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class sub_category extends AppCompatActivity {

    GridView gridview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category);

        gridview = findViewById(R.id.gridview);
        SubcategoryAdapter subcategoryAdapter=new SubcategoryAdapter(getApplicationContext());
        gridview.setAdapter(subcategoryAdapter);

    }
}
