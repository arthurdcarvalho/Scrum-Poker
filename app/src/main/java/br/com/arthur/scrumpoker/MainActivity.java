package br.com.arthur.scrumpoker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Button id1, id2, id3, id4, id5, id6, id7, id8, id9;
    private EditText editText;
    private Button other;
    Intent it;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id1 = findViewById(R.id.id1);
        id2 = findViewById(R.id.id2);
        id3 = findViewById(R.id.id3);
        id4 = findViewById(R.id.id4);
        id5 = findViewById(R.id.id5);
        id6 = findViewById(R.id.id6);
        id7 = findViewById(R.id.id7);
        id8 = findViewById(R.id.id8);
        id9 = findViewById(R.id.id9);
        editText = findViewById(R.id.editText);
        other = findViewById(R.id.other);

        id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showValue(id1);
            }
        });
        id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showValue(id2);
            }
        });
        id3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showValue(id3);
            }
        });
        id4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showValue(id4);
            }
        });
        id5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showValue(id5);
            }
        });
        id6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showValue(id6);
            }
        });
        id7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showValue(id7);
            }
        });
        id8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showValue(id8);
            }
        });
        id9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showValue(id9);
            }
        });

        it = new Intent(this, CardActivity.class);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString();
                it.putExtra("Valor", value);
                startActivity(it);
            }
        });
    }

    void showValue(Button button) {
        it = new Intent(this, CardActivity.class);
        String value = (String) button.getText();
        it.putExtra("Valor", value);
        startActivity(it);
    }
}