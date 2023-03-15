package joao.vitor.oliveira.scheidegger.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent i         = this.getIntent();//pega a ligação que iniciou esta atividade
        String digitText = i.getStringExtra("texto");//extrai a váriavel que foi passada pela ligação
        TextView tvText  = findViewById(R.id.tvText);//pega o objeto que é um textView
        tvText.setText(digitText);//e seta o o texto dele para a váriavel extraída, ou seja, para o que a pessoa tinha digitado na tela passada
        //obs: todas estas operações (tanto nessa atividade quanto na outra) foram realizadas nos construtores dela

    }
}