package ar.com.tristeslostrestigres.redpanal;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import ar.com.tristeslostrestigres.redpanal.Helpers.Console;

public class CustomActionBarActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Console.mensajeDebug(this.getLocalClassName()+": onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Console.mensajeDebug(this.getLocalClassName()+": onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Console.mensajeDebug(this.getLocalClassName()+": onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Console.mensajeDebug(this.getLocalClassName()+": onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Console.mensajeDebug(this.getLocalClassName()+": onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Console.mensajeDebug(this.getLocalClassName()+": onDestroy");
    }

}
