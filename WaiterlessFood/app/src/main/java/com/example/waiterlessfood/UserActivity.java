package com.example.waiterlessfood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.waiterlessfood.model.model;
import com.example.waiterlessfood.model.myAdapter;
import com.example.waiterlessfood.prevelent.Prevelents;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

import io.paperdb.Paper;

public class UserActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    myAdapter adapter;
    static public String phoneNumber;
    static public ProgressDialog loadingBar;
    int flag = 0;
    public  void checkOutProduct(View view){
        flag++;
        String temp = ""+flag;
        Paper.book().write(Prevelents.flag,temp);
        Intent intent = new Intent(getApplicationContext(),ProductCartDetailActivity.class);
        startActivity(intent);
        String temp1 = Paper.book().read(Prevelents.flag);
        Log.i("USerActivity",""+flag+" "+temp);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_option,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.menu_logout){
            Paper.book().destroy();
            Intent intent = new Intent(UserActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        recyclerView =  findViewById(R.id.cardView);
        Button chechOut = findViewById(R.id.checkOut);
        Intent intent = getIntent();
        phoneNumber = intent.getStringExtra("phone");
        loadingBar = new ProgressDialog(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Product"), model.class)
                        .build();
        adapter =new myAdapter(options);
        recyclerView.setAdapter(adapter);


    }
    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }

}