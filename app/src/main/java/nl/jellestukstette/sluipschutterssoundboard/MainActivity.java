package nl.jellestukstette.sluipschutterssoundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt;
    Button bthitler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button) findViewById(R.id.btnViezeVuile);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sample);
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mp.start();
            }
        });

        bthitler = (Button) findViewById(R.id.btnHeeHitler);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.heehitler);
        bthitler.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mp2.start();
                // only change for push
            }
        });
    }
}
