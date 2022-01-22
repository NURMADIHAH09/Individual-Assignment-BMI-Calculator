package com.example.individualassignment2ndattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView inst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inst=findViewById(R.id.instagram);

        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.dietitians.org.my/");
            }
        });

        EditText w=findViewById(R.id.etWeight);
        EditText h=findViewById(R.id.etHeight);
        Button calc=findViewById(R.id.btCalcl);
        TextView output=findViewById(R.id.tvOutput);
        TextView z=findViewById(R.id.madihah);
        TextView k=findViewById(R.id.risk);


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getw=w.getText().toString();
                String geth=h.getText().toString();

                double dW=Double.parseDouble(getw);
                double dH=Double.parseDouble(geth);

                double bmi=dW/(dH*dH);

                output.setText(String.valueOf(bmi));

                if(bmi<=18.4){
                    z.setText("Underweight");
                }
                else if (bmi>=18.5 && bmi<=24.9){
                    z.setText("Normal Weight");
                }
                else if (bmi>=25 && bmi<=29.9){
                    z.setText("Overweight");
                }
                else if (bmi>=30 && bmi<=34.9){
                    z.setText("Moderately Obese");
                }
                else if (bmi>=35 && bmi<=39.9){
                    z.setText("Severely Obese");
                }
                else{
                    z.setText("Very Severely Obese");
                }

                if(bmi<=18.4){
                    k.setText("Malnutrition Risk");
                }
                else if (bmi>=18.5 && bmi<=24.9){
                    k.setText("Low Risk");
                }
                else if (bmi>=25 && bmi<=29.9){
                    k.setText("Enhanced Risk");
                }
                else if (bmi>=30 && bmi<=34.9){
                    k.setText("Medium Risk");
                }
                else if (bmi>=35 && bmi<=39.9){
                    k.setText("High Risk");
                }
                else{
                    k.setText("Very High Risk");
                }


            }
        });


    }

    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}
