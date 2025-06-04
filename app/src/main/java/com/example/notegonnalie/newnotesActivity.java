package com.example.notegonnalie;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class newnotesActivity extends AppCompatActivity {

    ImageView backButtonToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_newnotes);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        backButtonToolBar = findViewById(R.id.backButtonToolBar);
        backButtonToolBar.setOnClickListener(new View.OnClickListener() {
                                                 public void onClick(View v) {
                                                     Intent intent = new Intent(newnotesActivity.this, HomenotesActivity.class);
                                                     startActivity(intent);
                                                 }
                                             }
        );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.securityItem){
            Toast.makeText(this, "Security Item", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.deleteItem){
            Toast.makeText(this, "Delete Item", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.themeItem){
            Toast.makeText(this, "Theme Item", Toast.LENGTH_SHORT).show();
        }

        return true;
    }
}