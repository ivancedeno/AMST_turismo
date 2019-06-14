package com.example.estudiante.app_mediconline;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Referencias a los controles

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
    }

    public void onClick(View v) {
        if(v.getId() == R.id.btn1){
            Log.d("mensaje","La region costa se caracterisa por sus hermosas playas");
        }
        if(v.getId() == R.id.btn2){
            Log.d("mensaje","La region sierra se caracterisa por sus monntañas y cordilleras");
        }
        if(v.getId() == R.id.btn3){
            Log.d("mensaje","La region oriente se caracterisa por su selva ");
        }
        if(v.getId() == R.id.btn4){
            Log.d("mensaje","La region insular se caracterisa por su biodiversidad de animales");
        }
    }
}
