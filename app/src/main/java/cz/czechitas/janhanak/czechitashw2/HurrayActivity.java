package cz.czechitas.janhanak.czechitashw2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class HurrayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hurray);
        TextView result = findViewById(R.id.resultTextView);
        result.setText(getString(R.string.number_is, getIntent().getIntExtra(Constants.NUMBER,0)));
    }
}
