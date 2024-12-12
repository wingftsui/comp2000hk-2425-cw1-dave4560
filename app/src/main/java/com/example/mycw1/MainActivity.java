package com.example.mycw1;
import android.widget.RelativeLayout;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.snackbar.Snackbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button buttonA = findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        View relativeLayout = findViewById(R.id.Relative_Layout);
        Button applysaveButton = findViewById(R.id.buttonN);

        applysaveButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Snackbar.make(relativeLayout,"Error: This is not an administrator account", Snackbar.LENGTH_SHORT).show();
            }
        }
        );
    }
}
