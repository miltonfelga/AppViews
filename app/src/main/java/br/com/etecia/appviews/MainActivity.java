package br.com.etecia.appviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNum1, etNum2;
    Button btnSomar;

    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.etNum1);
        etNum2 = (EditText) findViewById(R.id.etNum2);
        btnSomar = (Button) findViewById(R.id.btnSomar);

        tvResultado = (TextView) findViewById(R.id.tvResultado);

        //ação do botão somar
        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double tvResp = 0;

                String Num1 = etNum1.getText().toString();
                String Num2 = etNum2.getText().toString();

                tvResp = Double.parseDouble(Num1) + Double.parseDouble(Num2);

                tvResultado.setText(String.valueOf(tvResp));
            }
        });

    }
}
