package jmendez.escoladeltreball.org.converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button convertBtn;
    private EditText miles;
    private EditText km;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convertBtn =  (Button) findViewById(R.id.convertBtn);
        miles = (EditText) findViewById(R.id.miles);
        km = (EditText) findViewById(R.id.km);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convert();
            }
        };
        convertBtn.setOnClickListener(listener);

    }
    //done
    private void convert() {
        //hasFocus significa que es el que el usuario ha clicado o está escribiendo (para el bidireccional)
        if (!(miles.getText().toString().equals("")) && miles.hasFocus()) {
            double milesLoc = Double.parseDouble(miles.getText().toString());
            double kmt = milesLoc * 1.62;
            km.setText(String.valueOf(kmt));

        }else {
            double kilometres = Double.parseDouble(km.getText().toString());
            double milles = kilometres * 0.62;
            miles.setText(String.valueOf(milles));
        }
    }
}
