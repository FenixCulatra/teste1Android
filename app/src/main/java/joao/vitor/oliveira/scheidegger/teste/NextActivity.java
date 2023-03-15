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
        Intent i         = this.getIntent();
        String digitText = i.getStringExtra("texto");
        TextView tvText  = findViewById(R.id.tvText);
        tvText.setText(digitText);

    }
}