package es.momopocket.temperatureconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText text;
    private Button mButton;
    private RadioButton mCelsiusButton, mFahrenheitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.inputValue);
        mButton = (Button) findViewById(R.id.button1);
        mCelsiusButton = (RadioButton) findViewById(R.id.radio0);
        mFahrenheitButton = (RadioButton) findViewById(R.id.radio1);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text.getText().length() == 0){
                    Toast.makeText(getApplicationContext(), "Please enter a valir number", Toast.LENGTH_LONG).show();
                    return;
                }

                float inputValue = Float.parseFloat(text.getText().toString());
                if(mCelsiusButton.isChecked()){
                    text.setText(String.valueOf(ConverterUtil.convertFahrenheitToCelsius(inputValue)));
                    mCelsiusButton.setChecked(false);
                    mFahrenheitButton.setChecked(true);
                } else {
                    text.setText(String.valueOf(ConverterUtil.convertCelsiusToFahrenheit(inputValue)));
                    mFahrenheitButton.setChecked(false);
                    mCelsiusButton.setChecked(true);
                }
            }
        });
    }
}
