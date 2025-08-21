package com.example.loginpage;

import android.os.Bundle; // Fixed typo: removed the '-' in import

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        Button login = findViewById(R.id.button2);

        login.setOnClickListener(new View.OnClickListener() { // Corrected class reference
            @Override
            public void onClick(View v) { // 'Public' -> 'public', method signature fixed
                if (username.getText().toString().equals("BABISHA") &&
                        password.getText().toString().equals("12345")) {

                    Toast.makeText(MainActivity.this, "WELCOME..", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Try Again..", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
