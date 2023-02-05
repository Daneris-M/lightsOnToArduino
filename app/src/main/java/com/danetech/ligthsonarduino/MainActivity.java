package com.danetech.ligthsonarduino;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.CheckBox;

import com.physicaloid.lib.Physicaloid;


public class MainActivity extends AppCompatActivity {

    Button btOpen, btClose,  btWrite;
    EditText etWrite;
    TextView tvRead;
    Spinner spBaud;
    CheckBox cbAutoscroll;

    Physicaloid mPhysicaloid; // initialising library

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}