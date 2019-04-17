package com.example.abhinav.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Thread th = new Thread(){
            public void run(){
                try{
                    sleep(3500);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                finally{
                    onPause();
                    startActivity(new Intent(HomeActivity.this,MyCalculatorActivity.class));
                }
            }
        };
        th.start();
    }

    @Override
    public void onPause(){
        super.onPause();
        finish();
    }
}
