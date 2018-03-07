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
    Button btTikTikTakkie;
    Button btZagIkNietAankomen;
    Button btPornoKijken;
    Button btDikkePik;
    Button btMjaa;
    Button btIetsVragen;
    Button btDikkeHoer;
    Button btNee1;
    Button btNee2;
    Button btGodverdomme;
    Button btJezusChristus;
    Button btLachMedewerker;
    Button btGekkigheidOpEenStokje;
    Button btHardePikWijn;
    Button btSlappePik;
    Button btEnJePikBlijftHard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button) findViewById(R.id.btnHeeHitler);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.heehitler);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });


        btstinkbek = (Button) findViewById(R.id.btnStinkBek);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.stinkbek);
        btstinkbek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp3.start();

            }
        });

        bthoerenpaard = (Button) findViewById(R.id.btnHoerenPaard);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.hoerenpaard);
        bthoerenpaard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp4.start();

            }
        });

        btTikTikTakkie = (Button) findViewById(R.id.btnTikTakkie);
        final MediaPlayer mptiktakkie = MediaPlayer.create(this, R.raw.tiktakkie);
        btTikTikTakkie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mptiktakkie.start();

            }
        });

        btZagIkNietAankomen = (Button) findViewById(R.id.btnZagIkNietAankomen);
        final MediaPlayer mpzagiknietaankomen = MediaPlayer.create(this, R.raw.diezagiknietaankomen);
        btZagIkNietAankomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpzagiknietaankomen.start();

            }
        });

        btPornoKijken = (Button) findViewById(R.id.btnPornoKijken);
        final MediaPlayer mpPornokijken = MediaPlayer.create(this, R.raw.eerlijkzeggenaftrekken);
        btPornoKijken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpPornokijken.start();

            }
        });

        btDikkePik = (Button) findViewById(R.id.btnGrotePik);
        final MediaPlayer mpThee = MediaPlayer.create(this, R.raw.dikkepikin);
        btDikkePik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpThee.start();

            }
        });

        btMjaa = (Button) findViewById(R.id.btnJaa);
        final MediaPlayer mpJaa = MediaPlayer.create(this, R.raw.ja);
        btMjaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpJaa.start();

            }
        });
        btIetsVragen = (Button) findViewById(R.id.btnIetsVragen);
        final MediaPlayer mpVragen = MediaPlayer.create(this, R.raw.magikjouietsvragen);
        btIetsVragen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpVragen.start();

            }
        });
        btDikkeHoer = (Button) findViewById(R.id.btnDikkeHoer);
        final MediaPlayer mpDikkeHoer = MediaPlayer.create(this, R.raw.dikkehoer);
        btDikkeHoer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpDikkeHoer.start();

            }
        });

        btNee1 = (Button) findViewById(R.id.btnNee1);
        final MediaPlayer mpNee1 = MediaPlayer.create(this, R.raw.nee1);
        btNee1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpNee1.start();

            }
        });

        btNee2 = (Button) findViewById(R.id.btnNee2);
        final MediaPlayer mpNee2 = MediaPlayer.create(this, R.raw.nee2);
        btNee2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpNee2.start();

            }
        });

        btGodverdomme = (Button) findViewById(R.id.btnGodverdomme);
        final MediaPlayer mpGodverdomme = MediaPlayer.create(this, R.raw.godverdomme);
        btGodverdomme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpGodverdomme.start();

            }
        });

        btJezusChristus = (Button) findViewById(R.id.btnJezusChristus);
        final MediaPlayer mpJezusChristus = MediaPlayer.create(this, R.raw.jezuscrhistus);
        btJezusChristus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpJezusChristus.start();

            }
        });

        btLachMedewerker = (Button) findViewById(R.id.btnLachMedewerker);
        final MediaPlayer mpLachVerkoop = MediaPlayer.create(this, R.raw.lachwijnverkoper);
        btLachMedewerker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpLachVerkoop.start();

            }
        });

        btGekkigheidOpEenStokje = (Button) findViewById(R.id.btnGekkigheidOpeenStokje);
        final MediaPlayer mpGekkigHeid = MediaPlayer.create(this, R.raw.gekkigheidopeenstokje);
        btGekkigheidOpEenStokje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpGekkigHeid.start();

            }
        });

        btHardePikWijn = (Button) findViewById(R.id.btnHardePikWijn);
        final MediaPlayer mpHardePikWijn = MediaPlayer.create(this, R.raw.pikhardwijn);
        btHardePikWijn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpHardePikWijn.start();

            }
        });

        btSlappePik = (Button) findViewById(R.id.btnSlappePik);
        final MediaPlayer mpSlappePik = MediaPlayer.create(this, R.raw.slappepik);
        btSlappePik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpSlappePik.start();

            }
        });

        btEnJePikBlijftHard = (Button) findViewById(R.id.btnEnJePik);
        final MediaPlayer mpEnJePikBlijftHard = MediaPlayer.create(this, R.raw.jepikblijfthard);
        btSlappePik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpEnJePikBlijftHard.start();

            }
        });
    }
}