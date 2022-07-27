package com.example.covid_19_registration_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class activity_teacher extends AppCompatActivity {

    Button btnTeacher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        btnTeacher = findViewById(R.id.btnSubmit);
        btnTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Thanks for Registering your data", Toast.LENGTH_SHORT).show();

                Intent loadStudentActivity = new Intent(getApplicationContext(), activity_thankyou2.class);
                startActivity(loadStudentActivity);
            }
        });

    }
}