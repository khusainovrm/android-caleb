package com.example.firstAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
    }

    public void launchSettings(View view){
        //launch new activity
        Intent i = new Intent(this, SettingsActivity.class);
        EditText inputView = findViewById(R.id.homeInput);
        String message = inputView.getText().toString();
        i.putExtra("Cool", message);
        startActivity(i);
    }
}