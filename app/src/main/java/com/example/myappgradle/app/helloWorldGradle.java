package com.example.myappgradle.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class helloWorldGradle extends ActionBarActivity {


    public native String getMessageFromNative();
    public native int getIntegerFromNative(int d);


    static {

        System.loadLibrary("myHello");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world_gradle);

        final TextView txtIntro= (TextView) findViewById(R.id.txtIntro);
        Button buttonTest= (Button) findViewById(R.id.buttonTest);



        int val = getIntegerFromNative(5);
        String txt= "Native says:" + getMessageFromNative() + "#value:" + String.valueOf(val);


        txtIntro.setText(txt);

        buttonTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random t= new Random();

                int d=t.nextInt(10);
                int val = getIntegerFromNative(d);

                String txt= "Native says:" + getMessageFromNative() + "#value("+String.valueOf(d)+"):" + String.valueOf(val);

                txtIntro.setText(txt);

            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hello_world_gradle, menu);
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
