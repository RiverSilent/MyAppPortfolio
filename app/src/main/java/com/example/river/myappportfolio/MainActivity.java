package com.example.river.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.project1);
        Button button2 = (Button)findViewById(R.id.project2);
        Button button3 = (Button)findViewById(R.id.project3);
        Button button4 = (Button)findViewById(R.id.project4);
        Button button5 = (Button)findViewById(R.id.project5);
        Button button6 = (Button)findViewById(R.id.project6);

    }

    public void displayToast(View view){
        switch (view.getId()){
            case R.id.project1:
                Toast.makeText(MainActivity.this,"This will launch the Spotify Streamer " +
                                "App.",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.project2:
                Toast.makeText(MainActivity.this,"This will launch the Scores App.",Toast
                        .LENGTH_LONG).show();
                break;
            case R.id.project3:
                Toast.makeText(MainActivity.this,"This will launch the Library App.",Toast
                        .LENGTH_LONG).show();
                break;
            case R.id.project4:
                Toast.makeText(MainActivity.this,"This will launch the Build It Bigger App.",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.project5:
                Toast.makeText(MainActivity.this,"This will launch the XYZ Reader App.",Toast
                        .LENGTH_LONG).show();
                break;
            case R.id.project6:
                Toast.makeText(MainActivity.this,"This will launch My Capstone App.",Toast
                        .LENGTH_LONG).show();
                break;
            default:
                Toast.makeText(MainActivity.this,"Something Happened.I don't know what!!!",Toast
                        .LENGTH_LONG).show();
                break;

        }

    }
}
