package es.spinner.ejemplo7;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
 private Spinner spinnerOpciones;
 private Button botonSelecionar;
 @Override
    protected void onCreate(Bundle savedInstanceState){
     super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);
     spinnerOpciones =findViewById(R.id.spinnerOpciones);
     botonSelecionar=findViewById(R.id.botonSelecionar);
             ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(
             this,
             R.array.opciones_array,
             android.R.layout.simple_spinner_item
     );
     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinnerOpciones.setAdapter(adapter);
     botonSelecionar.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            String seleccion=spinnerOpciones.getSelectedItem().toString();
            Toast.makeText(MainActivity.this,"Seleccionaste"+seleccion, Toast.LENGTH_SHORT).show();
        }

    });
 }

}