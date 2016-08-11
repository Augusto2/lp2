package com.example.alunos.augustobastos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class otsugua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otsugua);

        final EditText num = (EditText) findViewById(R.id.valor);
        Button btn = (Button) findViewById(R.id.buton);
        final TextView txt = (TextView) findViewById(R.id.resposta);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i = Integer.parseInt(num.getText().toString());
                int r=1,p=1;

                while (r<= i){
                    p = p * r;
                    r++;
                }

                txt.setText(""+p);
            }
        });
    }
}
