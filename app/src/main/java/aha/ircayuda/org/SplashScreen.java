package aha.ircayuda.org;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {


    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlertas();
            }
        });

        int DURATION_SPLASH = 5000;
        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, DURATION_SPLASH);
    }

    public void openAlertas() {
        Intent intent = new Intent(this, Alertas.class);
        startActivity(intent);
    }

    public void Alertas(View view) {
    }
}

