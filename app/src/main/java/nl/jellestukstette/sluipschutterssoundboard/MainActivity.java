package nl.jellestukstette.sluipschutterssoundboard;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt;
    Button btstinkbek;
    Button bthoerenpaard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button) findViewById(R.id.btnHeeHitler);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.heehitler);
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mp.start();
            }
        });


        btstinkbek = (Button) findViewById(R.id.btnStinkBek);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.stinkbek);
        btstinkbek.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mp3.start();

            }
        });

        bthoerenpaard = (Button) findViewById(R.id.btnHoerenPaard);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.hoerenpaard);
        bthoerenpaard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mp4.start();
                // only change for push
            }
        });
    }
}
