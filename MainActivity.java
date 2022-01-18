package com.example.individualassignment2ndattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText w=findViewById(R.id.etWeight);
        EditText h=findViewById(R.id.etHeight);
        Button calc=findViewById(R.id.btCalcl);
        TextView output=findViewById(R.id.tvOutput);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getw=w.getText().toString();
                String geth=h.getText().toString();

                double dW=Double.parseDouble(getw);
                double dH=Double.parseDouble(geth);

                double bmi=dW/(dH*dH);

                output.setText(String.valueOf(bmi));
            }
        });


    }
}
