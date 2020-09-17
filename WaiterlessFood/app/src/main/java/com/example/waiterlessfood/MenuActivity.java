package com.example.waiterlessfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import io.paperdb.Paper;

public class MenuActivity extends AppCompatActivity {

    private ImageView tShirts,sportTShirts,femaleDresses,sweathers;
    private ImageView shoes,glasses,books,hatsCaps;
    private ImageView headPhones,laptops,watches,mobilePhones;
    private Button logoutBtn;

    public void logout(View view){
        Paper.book().destroy();
        Intent intent = new Intent(MenuActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        tShirts = findViewById(R.id.men_tshirt);
        sportTShirts = findViewById(R.id.sport_tshirt);
        femaleDresses = findViewById(R.id.women_tshirt);
        sweathers = findViewById(R.id.shewtwer);
        shoes = findViewById(R.id.shoes);
        glasses = findViewById(R.id.glass);
        books = findViewById(R.id.books);
        hatsCaps = findViewById(R.id.hats);
        headPhones = findViewById(R.id.headphone);
        laptops = findViewById(R.id.laptop);
        watches = findViewById(R.id.watches);
        mobilePhones = findViewById(R.id.mobile_phones);
        logoutBtn = findViewById(R.id.adminLogout);



        tShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,AddProductActivity.class);
                intent.putExtra("catagary","Sweets");
                startActivity(intent);
            }
        });
        sportTShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,AddProductActivity.class);
                intent.putExtra("catagary","Vegetables");
                startActivity(intent);
            }
        });

        femaleDresses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,AddProductActivity.class);
                intent.putExtra("catagary","Pizza");
                startActivity(intent);
            }
        });
        sweathers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,AddProductActivity.class);
                intent.putExtra("catagary","Burgers");
                startActivity(intent);
            }
        });


        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,AddProductActivity.class);
                intent.putExtra("catagary","Non-veges");
                startActivity(intent);
            }
        });
        glasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,AddProductActivity.class);
                intent.putExtra("catagary","Drinks");
                startActivity(intent);
            }
        });
        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,AddProductActivity.class);
                intent.putExtra("catagary","Ice-Creame");
                startActivity(intent);
            }
        });
        hatsCaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,AddProductActivity.class);
                intent.putExtra("catagary","Chocolates");
                startActivity(intent);
            }
        });

        laptops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,AddProductActivity.class);
                intent.putExtra("catagary","Cakes");
                startActivity(intent);
            }
        });
        headPhones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,AddProductActivity.class);
                intent.putExtra("catagary","Extra");
                startActivity(intent);
            }
        });

    }
}