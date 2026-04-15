package com.twisthour.love_story;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {


    private SharedPreferences data;
    private ImageView imageview1;
    private LinearLayout linear1;
    private LinearLayout linear2;
    private ProgressBar progressbar1;
    private TimerTask t;
    private Timer _timer = new Timer();
    private Intent i = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        initialize();
        initializeLogic();
    }

    private void initialize() {
        this.linear1 = findViewById(R.id.linear1);
        this.linear2 = findViewById(R.id.linear2);
        this.progressbar1 = (ProgressBar) findViewById(R.id.progressbar1);
        this.imageview1 = findViewById(R.id.imageview1);


        this.data = getSharedPreferences("data", 0);
    }

    private void initializeLogic() {
        if (this.data.getString("theme", "").equals("night_theme")) {
            this.linear1.setBackgroundColor(Color.parseColor("#212121"));
            Window window = getWindow();
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(Color.parseColor("#FF212121"));
            window.setNavigationBarColor(Color.parseColor("#FF212121"));
        } else {
            this.linear1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            Window window3 = getWindow();
            window3.clearFlags(67108864);
            window3.addFlags(Integer.MIN_VALUE);
            window3.getDecorView().setSystemUiVisibility(8192);
            window3.setStatusBarColor(Color.parseColor("#FFFFFF"));
            window3.setNavigationBarColor(Color.parseColor("#FFFFFF"));
        }
        this.t = new TimerTask() {
            @Override
            public void run() {
                Splash.this.runOnUiThread(() -> {
                    Splash.this.i.setClass(Splash.this.getApplicationContext(), MainActivity.class);
                    Splash.this.startActivity(Splash.this.i);
                    Splash.this.finish();
                });
            }
        };
        this._timer.schedule(this.t, 1000L);
    }


    @Override
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }


}