package com.example.mycw1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.google.android.material.snackbar.Snackbar;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main11);

        Button buttonK = findViewById(R.id.buttonK);
        buttonK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity11.this, MainActivity12.class);
                startActivity(intent);
            }
        });
        View relativeLayout = findViewById(R.id.Relative_Layout);
        Button applysaveButton = findViewById(R.id.buttonK);

        applysaveButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Snackbar.make(relativeLayout,"Profile successfully updated", Snackbar.LENGTH_SHORT).show();
            }
                                           }
        );

    }
}