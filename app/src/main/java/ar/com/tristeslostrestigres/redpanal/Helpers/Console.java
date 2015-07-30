package ar.com.tristeslostrestigres.redpanal.Helpers;

import android.util.Log;

/*
 * Methods and helpers for displaying console messages
 */
public class Console {

    // DEBUG
    @SuppressWarnings(value = "unused")
    public static void mensajeDebug(String message) {

        if (Constants.MSG_DEBUG)
            Log.d("MESSAGE", message);

    }

    // INFO
    @SuppressWarnings(value = "unused")
    public static void mensajeInfo(String message) {

        if (Constants.MSG_INFO)
            Log.i("MESSAGE", message);

    }

    // WARNING
    @SuppressWarnings(value = "unused")
    public static void mensajeWarning(String message) {

        if (Constants.MSG_WARN)
            Log.w("MESSAGE", message);

    }

    // ERROR
    @SuppressWarnings(value = "unused")
    public static void mensajeError(String message) {

        if (Constants.MSG_ERR)
            Log.e("MESSAGE", message);

    }
}
