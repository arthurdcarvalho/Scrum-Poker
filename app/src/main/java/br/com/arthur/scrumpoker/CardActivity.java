package br.com.arthur.scrumpoker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CardActivity extends AppCompatActivity {

    TextView textView;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        textView = findViewById(R.id.textView);

        Intent it = getIntent();
        if ( it != null ) {
            value = it.getStringExtra("Valor");
        }
        textView.setText(value);
    }
}
