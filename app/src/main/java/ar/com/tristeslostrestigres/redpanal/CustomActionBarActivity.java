package ar.com.tristeslostrestigres.redpanal;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

public class CustomActionBarActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(this.getLocalClassName(), "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(this.getLocalClassName(), "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(this.getLocalClassName(), "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(this.getLocalClassName(), "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(this.getLocalClassName(), "onStope");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(this.getLocalClassName(), "onDestroy");
    }

}
