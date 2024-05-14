package com.example.aula05_mobile;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tvQtdDados;
    private TextView tvTipoDeDado;

    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rbD4;
    private RadioButton rbD6;
    private RadioButton rbD8;
    private RadioButton rbD10;
    private RadioButton rbD12;
    private RadioButton rbD20;
    private RadioButton rbD100;

    private TextView tvResDado1;
    private TextView tvResDado2;
    private TextView tvResDado3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);

        rbD4 = findViewById(R.id.rbD4);
        rbD6 = findViewById(R.id.rbD6);
        rbD8 = findViewById(R.id.rbD8);
        rbD10 = findViewById(R.id.rbD10);
        rbD12 = findViewById(R.id.rbD12);
        rbD20 = findViewById(R.id.rbD20);
        rbD100 = findViewById(R.id.rbD100);

        tvResDado1 = findViewById(R.id.tvResDado1);
        tvResDado2 = findViewById(R.id.tvResDado2);
        tvResDado3 = findViewById(R.id.tvResDado3);

        Button btnJogarDados = findViewById(R.id.btnJogarDados);

        btnJogarDados.setOnClickListener(operacao -> valorDasFaces());

    }

    private void valorDasFaces() {

        if (rb1.isChecked()) {
            int resultadoFace = faceDado();
            String res = getString(R.string.tvResDado1) + resultadoFace;
            tvResDado1.setText(res);

        } else if (rb2.isChecked()) {
            int resultadoFace = faceDado();
            int resultadoFace2 = faceDado();
            String res = getString(R.string.tvResDado1) + resultadoFace;
            String res2 = getString(R.string.tvResDado2) + resultadoFace2;
            tvResDado1.setText(res);
            tvResDado2.setText(res2);

        } else {
            int resultadoFace = faceDado();
            int resultadoFace2 = faceDado();
            int resultadoFace3 = faceDado();
            String res = getString(R.string.tvResDado1) + resultadoFace;
            String res2 = getString(R.string.tvResDado2) + resultadoFace2;
            String res3 = getString(R.string.tvResDado3) + resultadoFace3;
            tvResDado1.setText(res);
            tvResDado2.setText(res2);
            tvResDado3.setText(res3);


        }

    }

    private int faceDado() {
        Random random = new Random();
        int valorFace;
        if(rbD4.isChecked()){
            valorFace = random.nextInt(4)+1;

        } else if (rbD6.isChecked()) {
            valorFace = random.nextInt(6)+1;

        } else if (rbD8.isChecked()) {
            valorFace = random.nextInt(8)+1;

        } else if (rbD10.isChecked()) {
            valorFace = random.nextInt(10)+1;

        } else if (rbD12.isChecked()) {
            valorFace = random.nextInt(12)+1;

        } else if (rbD20.isChecked()) {
            valorFace = random.nextInt(20)+1;

        } else {
            valorFace = random.nextInt(100)+1;
        }
        return valorFace;
    }

}