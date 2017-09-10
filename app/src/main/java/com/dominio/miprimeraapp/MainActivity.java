package com.dominio.miprimeraapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private static final String TAG="MainActivity";


    private EditText user;
    private EditText pass;
    private Button boton;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"estamos es onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"estamos es onStart()");

        user = (EditText)findViewById(R.id.et_name);
        pass = (EditText)findViewById(R.id.et_pass);
        boton=(Button)findViewById(R.id.btn_login);
        boton.setOnClickListener(new View.OnClickListener()
        { public void onClick(View view)

        {
            View v = MainActivity.this.getCurrentFocus();
            if (v != null){
                InputMethodManager imm= (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(v.getWindowToken(),0);
            }

            String username=user.getText().toString();
            String password=pass.getText().toString();

            if(username.equals("javier") && password.equals("123")){
                Toast.makeText(MainActivity.this,"las credenciales son correctas",Toast.LENGTH_SHORT).show();

            }
            else{
                Toast.makeText(MainActivity.this,"usuario incorrecto",Toast.LENGTH_SHORT).show();}

            }
        } );




    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"estamos es onResumen()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"estamos es onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"estamos es onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"estamos es onStop()");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"estamos es onDestroy()");
    }
}
