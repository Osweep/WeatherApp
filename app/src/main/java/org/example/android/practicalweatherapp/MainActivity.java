package org.example.android.practicalweatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private Button mBtnCirrus, mBtn2Cirro, mBtn3Altos, mBtn4Cirrostratus, mBtn5WMS, mBtn6TEMP, mBtn7Cumulus, mBtn8StrCumulus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_view);

        mBtnCirrus = (Button) findViewById(R.id.btn_cirru);
        mBtnCirrus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Cirrus.class);
                startActivity(intent);
            }
        });
        mBtn2Cirro = (Button) findViewById(R.id.btn_cirro);
        mBtn2Cirro.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), Cirrocumulus.class);
                    startActivity(intent);
                }
            });

        mBtn3Altos = (Button) findViewById(R.id.btn_altos);
        mBtn3Altos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Altostratus.class);
                startActivity(intent);
            }
        });

        mBtn4Cirrostratus = (Button) findViewById(R.id.btn_cirrostratus);
        mBtn4Cirrostratus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Cirrostratus.class);
                startActivity(intent);
            }
        });

        mBtn5WMS = (Button) findViewById(R.id.btn_wms);
        mBtn5WMS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WeatherMapSymbols.class);
                startActivity(intent);
            }
        });

        mBtn6TEMP = (Button) findViewById(R.id.btn_temp);
        mBtn6TEMP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Temperature.class);
                startActivity(intent);
            }
        });
        mBtn7Cumulus = (Button) findViewById(R.id.btn_cum);
        mBtn7Cumulus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Cumulus.class);
                startActivity(intent);
            }
        });

        mBtn8StrCumulus = (Button) findViewById(R.id.btn_strcum);
        mBtn8StrCumulus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Stratocumulus.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
