package estudo.br.duastelas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    /**
     * Declarar os objetos que estão presentes na View
     */
    EditText nome;
    EditText sexo;
    Button btSeguinte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // chama a tela inicial (view)
        setContentView(R.layout.activity_main);

        /**
         * Identificar os controles presentes na View (principal)
         */
        nome = (EditText) findViewById(R.id.editNome);
        sexo = (EditText) findViewById(R.id.editSexo);
        btSeguinte = (Button) findViewById(R.id.buttonSeguinte);

        btSeguinte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Configurar os objetos para manipular os valores
                Intent tela2 = new Intent(MainActivity.this, MainActivitySaida.class);

                // Colocar os valores dentro do Bundle (pacote de dados)
                Bundle params = new Bundle();

                // atribuir o valores através das chaves (nome dos campos)
                params.putString("nome", nome.getText().toString());
                params.putString("sexo", sexo.getText().toString());

                // atribuido as chaves/valores para o objeto tela2
                tela2.putExtras(params);

                // inicializar a segunda activity
                startActivity(tela2);

            }
        });
    }
}
