package es.checkbox.ejemplo6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class  MainActivity extends AppCompatActivity {
    private CheckBox checkBoxTerminos;
    private Button botonValidar;
    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBoxTerminos = findViewById(R.id.checkBoxTerminos);
        botonValidar = findViewById(R.id.botonValidar);
        botonValidar.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            if (checkBoxTerminos.isChecked()) {
                Toast.makeText(MainActivity.this, "Aceptaste los término", Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(MainActivity.this, "Debes aceptar los terminos", Toast.LENGTH_SHORT).show();

            }
        }
    });
}
}




