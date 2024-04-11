package com.example.premierprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) this.findViewById(R.id.button_affiche_ok);
        final TextView affichage = (TextView) this.findViewById(R.id.tv_affichage);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                affichage.setText(R.string.mess_after_clic_ok);
            }
        });
    }
}