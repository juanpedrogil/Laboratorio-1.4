package com.debug.prueba.aplicacion.juanpedrog.laboratorio14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mLog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLog=findViewById(R.id.mLog);
        mLog.setMovementMethod(new ScrollingMovementMethod());
        mLog.setText("");
    }
    public void runCode(View view) {
        mLog.setText("runCode");
    }
    public void clearLog(View view) {
        mLog.setText("");
        mLog.scrollTo(0, 0);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        logMessage("En el método onStop");
    }
    private void logMessage(String message){
        Log.d("my tag",message+"\n");
    }

}
