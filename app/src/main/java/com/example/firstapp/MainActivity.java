package com.example.firstapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.productRecyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        productList = new ArrayList<>();
        productAdapter = new ProductAdapter(productList);
        recyclerView.setAdapter(productAdapter);

        loadProducts();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    /*@Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_profile:
                Toast.makeText(this, "Otvoren profil", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_settings:
                Toast.makeText(this, "Otvorena podešavanja", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_logout:
                Toast.makeText(this, "Odjava uspešna", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }*/
    private void loadProducts() {
        // Dodajte proizvode u productList listu za prikaz (primer podataka)
        productList.add(new Product("Proizvod 1", 500.0, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.freepik.com%2Ffree-ai-image%2Forganic-cosmetic-product-with-dreamy-aesthetic-fresh-background_168934522.htm&psig=AOvVaw0h8vhTPgu5cwi2Uq7GLNLQ&ust=1731708496404000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCIDW8v7q3IkDFQAAAAAdAAAAABAE"));
        productList.add(new Product("Proizvod 2", 300.0, "https://www.google.com/url?sa=i&url=https%3A%2F%2Funsplash.com%2Fs%2Fphotos%2Fproducts&psig=AOvVaw0h8vhTPgu5cwi2Uq7GLNLQ&ust=1731708496404000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCIDW8v7q3IkDFQAAAAAdAAAAABAK"));
        productAdapter.notifyDataSetChanged();
    }
}