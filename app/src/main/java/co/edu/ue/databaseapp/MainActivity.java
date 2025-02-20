package co.edu.ue.databaseapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private EditText etDocumento;
    private EditText etUsuario;
    private EditText etNombres;
    private EditText etApellidos;
    private EditText etContraseña;
    private ListView listUsers;
    SQLiteDatabase sqLiteDatabase;
    private Button btnGuardar;
    private Button btnListUsers;
    private int documento;
    private String nombre;
    private String apellidos;
    private String usuario;
    private String pass;


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
        initObject();
    }


    //Método de inicialización de objetos con la vista
    private void initObject(){
        this.context = getApplicationContext();
        this.etDocumento = findViewById(R.id.etDocumento);
        this.etUsuario = findViewById(R.id.etUsuario);
        this.etNombres = findViewById(R.id.etNombres);
        this.etApellidos = findViewById(R.id.etApellidos);
        this.etContraseña = findViewById(R.id.etContraseña);
        this.listUsers = findViewById(R.id.lvLista);

    }

}