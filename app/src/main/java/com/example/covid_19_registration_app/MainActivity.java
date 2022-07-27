package com.example.covid_19_registration_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView btnStudent;
    ImageView btnTeacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStudent = findViewById(R.id.btnStudent);
        btnTeacher = findViewById(R.id.btnTeacher);
        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Student Clicked", Toast.LENGTH_SHORT).show();
                Intent loadStudentActivity = new Intent(getApplicationContext(), activity_student.class);
                startActivity(loadStudentActivity);

            }
        });

        btnTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button Teacher Clicked", Toast.LENGTH_SHORT).show();
                Intent loadStudentActivity1 = new Intent(getApplicationContext(), activity_teacher.class);
                startActivity(loadStudentActivity1);

            }
        });

    }
}