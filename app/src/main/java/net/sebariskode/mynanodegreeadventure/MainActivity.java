package net.sebariskode.mynanodegreeadventure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button spotifyBtn = (Button) findViewById(R.id.spotify_streamer);
        Button scoresBtn = (Button) findViewById(R.id.scores_app);
        Button librarybtn = (Button) findViewById(R.id.library_app);
        Button buildItBigger = (Button) findViewById(R.id.build_it_bigger);
        Button xyzReader = (Button) findViewById(R.id.xyz_reader);
        Button capstoneBtn = (Button) findViewById(R.id.capstone_app);

        try {
            spotifyBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "This button will launch my spotify app!", Toast.LENGTH_LONG).show();
                }
            });

            scoresBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "This button will launch my scores app!", Toast.LENGTH_LONG).show();
                }
            });

            librarybtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "This button will launch my library app!", Toast.LENGTH_LONG).show();
                }
            });

            buildItBigger.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "This button will launch my built it bigger app!", Toast.LENGTH_LONG).show();
                }
            });

            xyzReader.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "This button will launch my xyz reader app!", Toast.LENGTH_LONG).show();
                }
            });

            capstoneBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "This button will launch my capstone app!", Toast.LENGTH_LONG).show();
                }
            });

        } catch (NullPointerException npe) {
            Log.e(TAG, "NullPointerException", npe);
        }
    }
}
