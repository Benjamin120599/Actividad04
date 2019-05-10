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
        if(gradosF.isChecked()){
            if(opcionC.isChecked()){
                res = fahrenheitToCelsius(grados);
                cajaC.setText(res+"");
                limpiarCajas(cajaF, cajaK, cajaR);
                restablecerCheckBox(opcionF, opcionK, opcionR);
            } if(opcionF.isChecked()){
                cajaF.setText(grados+"");
                limpiarCajas(cajaC, cajaK, cajaR);
                restablecerCheckBox(opcionC, opcionK, opcionR);
            } if(opcionK.isChecked()){
                res = fahrenheitToKelvin(grados);
                cajaK.setText(res+"");
                limpiarCajas(cajaC, cajaF, cajaR);
                restablecerCheckBox(opcionC, opcionF, opcionR);
            } if(opcionR.isChecked()){
                res = fahrenheitToRankine(grados);
                cajaR.setText(res+"");
                limpiarCajas(cajaC, cajaF, cajaK);
                restablecerCheckBox(opcionC, opcionF, opcionK);
            }
        }
        if(gradosK.isChecked()){
            if(opcionC.isChecked()){
                res = kelvinToCelsius(grados);
                cajaC.setText(res+"");
                limpiarCajas(cajaF, cajaK, cajaR);
                restablecerCheckBox(opcionF, opcionK, opcionR);
            } if(opcionF.isChecked()){
                res = kelvinToFahrenheit(grados);
                cajaF.setText(res+"");
                limpiarCajas(cajaC, cajaK, cajaR);
                restablecerCheckBox(opcionC, opcionK, opcionR);
            } if(opcionK.isChecked()){
                cajaK.setText(grados+"");
                limpiarCajas(cajaC, cajaF, cajaR);
                restablecerCheckBox(opcionC, opcionF, opcionR);
            } if(opcionR.isChecked()){
                res = kelvinToRankine(grados);
                cajaR.setText(res+"");
                limpiarCajas(cajaC, cajaF, cajaK);
                restablecerCheckBox(opcionC, opcionF, opcionK);
            }
        }
        if(gradosR.isChecked()){
            if(opcionC.isChecked()){
                res = rankineToCelsius(grados);
                cajaC.setText(res+"");
                limpiarCajas(cajaF, cajaK, cajaR);
                restablecerCheckBox(opcionF, opcionK, opcionR);
            } if(opcionF.isChecked()){
                res = rankineToFahrenheit(grados);
                cajaF.setText(res+"");
                limpiarCajas(cajaC, cajaK, cajaR);
                restablecerCheckBox(opcionC, opcionK, opcionR);
            } if(opcionK.isChecked()){
                res = rankineToKelvin(grados);
                cajaK.setText(res+"");
                limpiarCajas(cajaC, cajaF, cajaR);
                restablecerCheckBox(opcionC, opcionF, opcionR);
            } if(opcionR.isChecked()){
                cajaR.setText(grados+"");
                limpiarCajas(cajaC, cajaF, cajaK);
                restablecerCheckBox(opcionC, opcionF, opcionK);
            }
        }
    }

    public double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        return fahrenheit;
    }
    public double celsiusToKelvin(double celsius) {
        double kelvin = celsius + 273.15;
        return kelvin;
    }
    public double celsiusToRankine(double celsius) {
        double rankine = (celsius * 1.8) + 491.67;
        return rankine;
    }
    public double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }
    public double fahrenheitToKelvin(double fahrenheit) {
        double kelvin = ( (fahrenheit - 32) / 1.8 ) + 273.15;
        return kelvin;
    }
    public double fahrenheitToRankine(double fahrenheit) {
        double rankine = fahrenheit + 459.67;
        return rankine;
    }
    public double kelvinToCelsius(double kelvin) {
        double celsius = kelvin - 273.15;
        return celsius;
    }
    public double kelvinToFahrenheit(double kelvin) {
        double fahrenheit = ( (kelvin - 273.15) * 1.8 ) + 32;
        return fahrenheit;
    }
    public double kelvinToRankine(double kelvin) {
        double rankine = kelvin * 1.8;
        return rankine;
    }
    public double rankineToCelsius(double rankine) {
        double celsius = (rankine - 491.67) / 1.8;
        return celsius;
    }
    public double rankineToFahrenheit(double rankine) {
        double fahrenheit = rankine - 459.67;
        return fahrenheit;
    }

}
