package com.example.firstAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void disable(View v){
        findViewById(R.id.button).setEnabled(false);
        ((Button)findViewById(R.id.button)).setText("Disabeld");
        findViewById(R.id.button2).setEnabled(true);
        ((TextView)findViewById(R.id.hello)).setText(String.valueOf(v.getId()));;
    }

    public void changeText(View view){
        view.setEnabled(false);
        ((TextView)findViewById(R.id.hello)).setText(String.valueOf(view.getId()));;
        findViewById(R.id.button).setEnabled(true);
    }

    public void handleInput(View view){
        EditText inputView = findViewById(R.id.input);
        String text = inputView.getText().toString();
//        ((TextView)findViewById(R.id.hello)).setText(text);

        Log.d("info", text);
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}