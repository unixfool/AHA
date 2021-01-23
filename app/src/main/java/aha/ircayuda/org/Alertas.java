package aha.ircayuda.org;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Alertas extends AppCompatActivity {

    PushNotification pushNotification;
    TextView name;
    SharedPreferences prefs;

    //Linea nueva
    private static boolean activityStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (   activityStarted
                && getIntent() != null
                && (getIntent().getFlags() & Intent.FLAG_ACTIVITY_REORDER_TO_FRONT) != 0) {
            finish();
            return;
        }

        setContentView(R.layout.activity_alertas);
        pushNotification = PushNotification.getInstance();
        prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        name = findViewById(R.id.name);

        name.setText (Html.fromHtml(prefs.getString("nameRecieved", "<p style='color:#e8495f;'><strong> NO</strong> <strong>ALERTS</strong> For the moment.</p> " )+"<br/>"
                +prefs.getString("lugarRecieved", " " )+"<br/>"
                +prefs.getString("fechaRecieved", " " )+"<br/>"
                +prefs.getString("horaRecieved", " " )+"<br/>"
                +prefs.getString("mensajeRecieved", " " )));

        activityStarted = true;
    }

    //Metodo Boton
    public void Inicio (View view) {
        Intent inicio = new Intent(this, MainActivity.class);
        finish();
        startActivity(inicio);
    }
}
