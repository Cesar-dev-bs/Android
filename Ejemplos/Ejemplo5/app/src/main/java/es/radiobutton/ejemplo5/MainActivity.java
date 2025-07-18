package es.radiobutton.ejemplo5;

import static es.radiobutton.ejemplo5.R.*;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup = findViewById(id.radioGroupOpciones);
    private Button botonMostrar = findViewById(id.botonMostrarSeleccion);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int idSeleccionado = radioGroup.getCheckedRadioButtonId();
                if (idSeleccionado != -1) {
                    RadioButton seleccionado = findViewById(idSeleccionado);
                    String texto = "Seleccionaste" + seleccionado.getText();
                    Toast.makeText(MainActivity.this, texto, Toast.LENGTH_SHORT);
                } else {
                    Toast.makeText(MainActivity.this, "No has seleccionado ninguna opcion", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}