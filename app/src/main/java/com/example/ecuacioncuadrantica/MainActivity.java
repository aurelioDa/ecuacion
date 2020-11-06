package com.example.ecuacioncuadrantica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    EditText a,b,c;
    Button CALCULAR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        a= (EditText) findViewById(R.id.A);
        b= (EditText) findViewById(R.id.B);
        c= (EditText) findViewById(R.id.C);
        CALCULAR= (Button) findViewById(R.id.CALCULAR);

        CALCULAR.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                String a1 = a.getText().toString();
                String a2 = b.getText().toString();
                String a3 = c.getText().toString();


                if(a1.isEmpty()||a2.isEmpty()||a3.isEmpty()){

                    if(a1.isEmpty()){
                        Toast.makeText(MainActivity.this, "debes de llenar todos los campos", Toast.LENGTH_SHORT).show();
                    }
                    if(a2.isEmpty()){
                        Toast.makeText(MainActivity.this, "debes de llenar todos los campos", Toast.LENGTH_SHORT).show();
                    }
                    if(a3.isEmpty()){
                        Toast.makeText(MainActivity.this, "debes de llenar todos los campos", Toast.LENGTH_SHORT).show();
                    }

                }
                else{


                    double A = Double.parseDouble(a.getText().toString());
                    double B = Double.parseDouble(b.getText().toString());
                    double C = Double.parseDouble(c.getText().toString());


//FORMULAS PARA RESULTADO

//DETERMINANTE

                    double d = ((B*B)-4*A*C);

                    C=C*-1;//operación para que el tecer número sea negativo, ya que si no es negativo no existirá una solución valida

                    if(d<0){

                        Toast.makeText(MainActivity.this, "No existen soluciones reales", Toast.LENGTH_SHORT).show();
                    }

                    else if (A<0){

//CONFIRMACIÓN DEL VALOR DE A
//SI A ES = 0 ENTONCES ES UNA DIVICIÓN SOBRE 0
                        Toast.makeText(MainActivity.this, "No existen soluciones reales", Toast.LENGTH_SHORT).show();
                    }

                    else{
//SOLUCIÓN

                        double x1 = ( -B + Math.sqrt(d))/(2*A);

                        double x2 = ( -B - Math.sqrt(d))/(2*A);

                        Toast.makeText(MainActivity.this, "Solución X1: " +x1 + "\n Solución X2: "+x2,
                                Toast.LENGTH_SHORT).show();
                    }  //llave del else

                }


            }
        });
    }
}