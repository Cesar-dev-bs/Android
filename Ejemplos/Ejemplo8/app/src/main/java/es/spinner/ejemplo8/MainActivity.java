package es.spinner.ejemplo8;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private Button botonFecha;
    private TextView textoFecha;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonFecha= findViewById(R.id.botonSeleccionarFecha);
        textoFecha=findViewById(R.id.textoFecha);
        botonFecha.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                final Calendar calendario= Calendar.getInstance();
                int anio=calendario.get(Calendar.YEAR);
                int mes=calendario.get(Calendar.YEAR);
                int dia=calendario.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog selectorFecha=new DatePickerDialog(
                        MainActivity.this,
                        new DatePickerDialog.OnDateSetListener(){
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                                String fecha = dayOfMonth + "/" + (month + 1) + "/" + year;
                                textoFecha.setText("Fecha seleccionada: " + fecha);
                            }
                        },
                        anio, mes, dia
                );

                selectorFecha.show();
            }
        });
    }
}
