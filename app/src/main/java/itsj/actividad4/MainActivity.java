package itsj.actividad4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton gradosC, gradosF, gradosR, gradosK;
    EditText cajaEntrada, cajaC, cajaF, cajaR, cajaK;
    CheckBox opcionC, opcionF, opcionR, opcionK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gradosC = findViewById(R.id.radioButtonC);
        gradosC.setOnClickListener(this);
        gradosF = findViewById(R.id.radioButtonF);
        gradosF.setOnClickListener(this);
        gradosK = findViewById(R.id.radioButtonK);
        gradosK.setOnClickListener(this);
        gradosR = findViewById(R.id.radioButtonR);
        gradosR.setOnClickListener(this);

        cajaEntrada = findViewById(R.id.cajaEntrada);
        cajaEntrada.setOnClickListener(this);
        cajaC = findViewById(R.id.cajaC);
        cajaC.setOnClickListener(this);
        cajaF = findViewById(R.id.cajaF);
        cajaF.setOnClickListener(this);
        cajaK = findViewById(R.id.cajaK);
        cajaK.setOnClickListener(this);
        cajaR = findViewById(R.id.cajaR);
        cajaR.setOnClickListener(this);

        opcionC = findViewById(R.id.checkBoxC);
        opcionC.setOnClickListener(this);
        opcionF = findViewById(R.id.checkBoxF);
        opcionF.setOnClickListener(this);
        opcionK = findViewById(R.id.checkBoxK);
        opcionK.setOnClickListener(this);
        opcionR = findViewById(R.id.checkBoxR);
        opcionR.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int evento = v.getId();
        double grados = Double.parseDouble(cajaEntrada.getText().toString());
        double res;

        if(gradosC.isChecked()) {

            if(opcionC.isChecked()){
                cajaC.setText(grados+"");
                limpiarCajas(cajaF, cajaK, cajaR);
                restablecerCheckBox(opcionF, opcionK, opcionR);
            } if(opcionF.isChecked()){
                res = celsiusToFahrenheit(grados);
                cajaF.setText(res+"");
                limpiarCajas(cajaC, cajaK, cajaR);
                restablecerCheckBox(opcionC, opcionK, opcionR);
            } if(opcionK.isChecked()){
                res = celsiusToKelvin(grados);
                cajaK.setText(res+"");
                limpiarCajas(cajaC, cajaF, cajaR);
                restablecerCheckBox(opcionC, opcionF, opcionR);
            } if(opcionR.isChecked()){
                res = celsiusToRankine(grados);
                cajaR.setText(res+"");
                limpiarCajas(cajaC, cajaF, cajaK);
                restablecerCheckBox(opcionC, opcionF, opcionK);
            }

        }

}
