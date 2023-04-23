package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText edtN1, edtN2;
    TextView txtM, txtSit;
    LinearLayout layResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtN1 = (EditText) findViewById(R.id.edtN1);
        edtN2 = (EditText) findViewById(R.id.edtN2);
        txtM = (TextView) findViewById(R.id.txtM);
        txtSit = (TextView) findViewById(R.id.txtSit);
        layResult = (LinearLayout) findViewById(R.id.layResult);
    }
    public void calcular(View view) {
        float n1 = Float.parseFloat(edtN1.getText().toString());
        float n2 = Float.parseFloat(edtN2.getText().toString());
        float m = (n1 + n2) / 2;

        txtM.setText(String.format("%.1f", m));

        if (m < 5) {
            //condição reprovado
            txtSit.setText(getString(R.string.strSitRp));
        } else if (m <7) {
            //condição de recuperação
            txtSit.setText(getString(R.string.strSitRC));
        } else {
            //condição de Aprovado
            txtSit.setText(getString(R.string.strSitAp));
        }

    }
}