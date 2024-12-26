package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CategoryActivity extends AppCompatActivity {

    private ImageView wine,juices,vinegars;
    private ImageView cosmetics,tea,honey;
    private ImageView spices,fruits, vegetables;
    private ImageView plants,medicine,woodhouses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        wine = (ImageView) findViewById(R.id.wine);
        juices = (ImageView) findViewById(R.id.juices);
        vinegars = (ImageView) findViewById(R.id.vinegars);
        cosmetics = (ImageView) findViewById(R.id.cosmetics);
        tea = (ImageView) findViewById(R.id.teas);
        honey = (ImageView) findViewById(R.id.honey);
        spices = (ImageView) findViewById(R.id.spices);
        fruits = (ImageView) findViewById(R.id.fruits);
        vegetables = (ImageView) findViewById(R.id.vegetables);
        plants = (ImageView) findViewById(R.id.plants);
        medicine = (ImageView) findViewById(R.id.medicine);
        woodhouses = (ImageView) findViewById(R.id.woodhouses);

        wine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, CategoryProductsActivity.class);
                intent.putExtra("category", "Wines");
                startActivity(intent);
            }
        });
        juices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, CategoryProductsActivity.class);
                intent.putExtra("category", "Juices");
                startActivity(intent);
            }
        });
        vinegars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, CategoryProductsActivity.class);
                intent.putExtra("category", "Vinegars");
                startActivity(intent);
            }
        });
        cosmetics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, CategoryProductsActivity.class);
                intent.putExtra("category", "Cosmetics");
                startActivity(intent);
            }
        });
        tea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, CategoryProductsActivity.class);
                intent.putExtra("category", "Tea");
                startActivity(intent);
            }
        });
        honey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, CategoryProductsActivity.class);
                intent.putExtra("category", "Honey");
                startActivity(intent);
            }
        });
        spices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, CategoryProductsActivity.class);
                intent.putExtra("category", "Spices");
                startActivity(intent);
            }
        });
        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, CategoryProductsActivity.class);
                intent.putExtra("category", "Fruits");
                startActivity(intent);
            }
        });
        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, CategoryProductsActivity.class);
                intent.putExtra("category", "Vegetables");
                startActivity(intent);
            }
        });
        plants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, CategoryProductsActivity.class);
                intent.putExtra("category", "Plants");
                startActivity(intent);
            }
        });
        medicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, CategoryProductsActivity.class);
                intent.putExtra("category", "Medicine");
                startActivity(intent);
            }
        });
        woodhouses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, CategoryProductsActivity.class);
                intent.putExtra("category", "Wood Houses");
                startActivity(intent);
            }
        });


    }
}