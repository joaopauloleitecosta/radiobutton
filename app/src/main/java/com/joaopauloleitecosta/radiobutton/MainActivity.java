package com.joaopauloleitecosta.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rgOpcoes = findViewById(R.id.rgOpcoes);
        rgOpcoes.setOnCheckedChangeListener((radioGroup, checkedId) -> {
            if (checkedId == R.id.rbOpcao0) {
                Toast.makeText(this, "Estudar Android ativado!", Toast.LENGTH_SHORT).show();
            } else if (checkedId == R.id.rbOpcao1) {
                Toast.makeText(this, "Estudar Flutter ativado!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Estudar React Native ativado!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}