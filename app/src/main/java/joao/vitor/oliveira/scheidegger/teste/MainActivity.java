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
        Button btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                EditText etText = findViewById(R.id.etText);
                String tText    = etText.getText().toString();
                Intent i = new Intent(MainActivity.this, NextActivity.class);
                i.putExtra("texto", tText);
                startActivity(i);
            }
        });

    }

}