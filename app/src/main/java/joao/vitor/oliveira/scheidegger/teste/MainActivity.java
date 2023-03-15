package joao.vitor.oliveira.scheidegger.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        Button btnSend = findViewById(R.id.btnSend);//pega o botão de enviar
        //abaixo é criado um evento para quando o botão for clicado
        btnSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText etText = findViewById(R.id.etText);//pega o texto que foi digitados
                String tText    = etText.getText().toString();//extrai o texto dele
                Intent i = new Intent(MainActivity.this, NextActivity.class);//cria uma ligação para outra atividade
                i.putExtra("texto", tText);//coloca uma váriavel, no caso o texto extraído, na ligação, para sermos capazes de usar essa váriavel em na outra atividade
                startActivity(i);//inicia a outra atividade
            }
        });

    }

}