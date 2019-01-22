package kds.kjca.co.kr.upbit;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Intro extends Activity {

    Handler handler = new Handler();
    Runnable r = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
    };

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);

    }

    @Override
    protected  void onResume() {
        super.onResume();
        handler.postDelayed(r, 2500 );
    }

    @Override
    protected  void onPause() {
        super.onPause();
        handler.removeCallbacks(r);
    }
}

