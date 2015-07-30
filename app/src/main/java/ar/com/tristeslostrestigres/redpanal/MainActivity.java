package ar.com.tristeslostrestigres.redpanal;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import ar.com.tristeslostrestigres.redpanal.Helpers.Notification;


public class MainActivity extends CustomActionBarActivity {

    private Toolbar app_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app_bar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(app_bar);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            Notification.shortToast(this, "Opción \"" + item.getTitle() + "\" seleccionada");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
