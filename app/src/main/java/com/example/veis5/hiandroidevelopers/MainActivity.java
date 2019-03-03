package com.example.veis5.hiandroidevelopers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Log.i("TAG", "Hi Android Developers!");
        Toast.makeText(MainActivity.this,"Hi Android Developers!",Toast.LENGTH_LONG).show();
    }
}

