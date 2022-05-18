package com.thannasorn.switchtoggleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Switch wifiSwitch, bluetoothSwitch;
    private ToggleButton toggleBtn1, toggleBtn2;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wifiSwitch = (Switch) findViewById(R.id.wifiSwitch);
        bluetoothSwitch = (Switch) findViewById(R.id.bluetoothSwitch);
        toggleBtn1 = (ToggleButton) findViewById(R.id.toggleButton1);
        toggleBtn2 = (ToggleButton) findViewById(R.id.toggleButton2);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnOk.setOnClickListener(this);
    }

    public void onClickSwitch(View v) {
        int id = v.getId();
        if (id == R.id.wifiSwitch) {
            if (wifiSwitch.isChecked())
                Toast.makeText(this, "Wifi On!", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Wifi Off!", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.bluetoothSwitch) {
            if (bluetoothSwitch.isChecked())
                Toast.makeText(this, "Bluetooth On!", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Bluetooth Off!", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickToggle(View v) {
        int id = v.getId();
        if (id == R.id.toggleButton1) {
            if (toggleBtn1.isChecked())
                Toast.makeText(this, "Wifi Toggle 1 On!", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "WiFi Toggle 1 Off!",
                        Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.toggleButton2) {
            if (toggleBtn2.isChecked())
                Toast.makeText(this, "Bluetooth Toggle 2 On!",
                        Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Bluetooth Toggle 2 Off!",
                        Toast.LENGTH_SHORT).show();
        }
    }

    public void onClick(View v) {
        String message = "";
        message += "Wifi " + (wifiSwitch.isChecked() ? " On " : " Off ");
        message += "\nBluetooth " + (bluetoothSwitch.isChecked() ? "On" : "Off");
        message += "\nWiFi ToggleButton 1 " + (toggleBtn1.isChecked() ? "On" : "Off");
        message += "\nBluetooth ToggleButton 2 " + (toggleBtn2.isChecked() ? "On" : "Off");
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}