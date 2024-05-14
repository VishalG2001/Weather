package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.weather.databinding.ActivityMainBinding;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainxml;
    //    private ProgressBar pgbar;
//    private RelativeLayout homeRL;
//    private TextView cityName,tempratureTV, conditionTV;
//    private ImageView backIV,iconIV,searchIV;
//    private TextInputEditText cityEdt;
//    private RecyclerView weatherRV;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainxml=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainxml.getRoot());
//        homeRL = findViewById(R.id.rlhome);
//        pgbar = findViewById(R.id.loadiingvg);
//        cityName = findViewById(R.id.idcityname);
//        tempratureTV = findViewById(R.id.temprature);
//        conditionTV = findViewById(R.id.idtvcondition);
//        backIV = findViewById(R.id.bgimage);
//        iconIV = findViewById(R.id.idivcon);
//        searchIV = findViewById(R.id.idsearch);
//        cityEdt = findViewById(R.id.editcity);
//        weatherRV = findViewById(R.id.idrvweather);
    }
}