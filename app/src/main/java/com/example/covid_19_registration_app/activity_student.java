package com.example.covid_19_registration_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_student extends AppCompatActivity {

    Button btnStudent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        btnStudent = findViewById(R.id.btnSubmit);
        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Thanks for Registering your data", Toast.LENGTH_SHORT).show();

                Intent loadStudentActivity = new Intent(getApplicationContext(), activity_thankyou2.class);
                startActivity(loadStudentActivity);
            }
        });
    }
}