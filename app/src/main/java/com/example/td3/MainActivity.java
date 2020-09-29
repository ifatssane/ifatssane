package com.example.td3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
     Button lancement_de;
     TextView affichage_de;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        affichage_de = findViewById(R.id.affiche_valeur_de);

        lancement_de = findViewById(R.id.button_lacement_de);
        lancement_de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast =  Toast.makeText(MainActivity.this,
                        "De lance",
                        Toast.LENGTH_SHORT);
                toast.show();

                int rand = (int)(6.0 * Math.random()) + 1;
                affichage_de.setText(" "+rand);
            }
        });
    }
}