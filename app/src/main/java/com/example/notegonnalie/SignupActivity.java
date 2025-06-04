package com.example.notegonnalie;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignupActivity extends AppCompatActivity {

    Button continueButton2;

    ImageView backButtonToolBar;

    TextView tof_ppText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        continueButton2 = (Button) findViewById(R.id.continueButton2);
        continueButton2.setOnClickListener(new View.OnClickListener() {
                                               public void onClick(View v) {
                                                   Intent intent = new Intent(SignupActivity.this, HomenotesActivity.class);
                                                   startActivity(intent);
                                               }
                                           }
        );

        backButtonToolBar = findViewById(R.id.backButtonToolBar);
        backButtonToolBar.setOnClickListener(new View.OnClickListener() {
                                                 public void onClick(View v) {
                                                     Intent intent = new Intent(SignupActivity.this, WelcomeActivity.class);
                                                     startActivity(intent);
                                                 }
                                             }
        );

        tof_ppText = findViewById(R.id.tof_ppText);
        tof_ppText.setOnClickListener(new View.OnClickListener() {
                                          public void onClick(View v) {
                                              Intent intent = new Intent(SignupActivity.this, TOF_PPActivity.class);
                                              startActivity(intent);
                                          }
                                      }
        );
    }
}