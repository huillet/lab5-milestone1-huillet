package com.example.lab5_milestone1_huillet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSubmit(View view)
    {
        EditText nameField = (EditText) findViewById(R.id.nameField);
        String str = nameField.getText().toString();

        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG.show());
        goToDisplayActivity(str);
    }

    public void goToDisplayActivity(String s)
    {
        Intent intent = new Intent(this, DisplayActivity.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
}