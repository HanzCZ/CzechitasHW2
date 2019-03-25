package cz.czechitas.janhanak.czechitashw2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int number;
    private EditText numberInput;
    private Button confirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput = findViewById(R.id.numberInput);
        confirmButton = findViewById(R.id.confirmButton);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer guess = Integer.parseInt(numberInput.getText().toString());
                if (number > guess) {
                    Toast.makeText(MainActivity.this, getString(R.string.higher), Toast.LENGTH_SHORT).show();
                } else if (number < guess) {
                    Toast.makeText(MainActivity.this, getString(R.string.lower), Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity.this, HurrayActivity.class);
                    intent.putExtra(Constants.NUMBER,number);
                    startActivity(intent);
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Random rn = new Random();
        number = rn.nextInt(10) + 1;
        numberInput.getText().clear();
    }
}