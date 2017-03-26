package estudo.br.duastelas;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivitySaida extends AppCompatActivity {
    /**
     * Declarar os objetos que estão presentes na View
     */
    TextView nome;
    TextView sexo;
    Button btVoltar;
    Bundle params;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // chama a tela inicial (view)
        setContentView(R.layout.activity_saida);

        /**
         * Identificar os controles presentes na View (secundária)
         */
        nome = (TextView) findViewById(R.id.textNome);
        sexo = (TextView) findViewById(R.id.textSexo);

        // recuperando a Intent enviada pela activity anterior
        Intent it = getIntent();

        if(it != null){
            Bundle params = it.getExtras();
            if(params != null){
                String strNome = params.getString(("nome"));
                String strSexo = params.getString(("sexo"));

                // enviar os valores para a View Saída
                nome.setText(strNome.toString());
                sexo.setText(strSexo.toString());
            }
        }

        btVoltar = (Button) findViewById(R.id.buttonVoltar);
        // ao clicar no botão voltar, leva para a acvtivity inicial
        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // elimina a activity
                finish();
            }
        });
    }
}
