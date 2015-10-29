package com.suhankoh.dagger2sandbox;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.suhankoh.dagger2sandbox.dagger.ApplicationComponent;
import com.suhankoh.dagger2sandbox.dagger.ApplicationModule;
import com.suhankoh.dagger2sandbox.dagger.DaggerApplicationComponent;
import com.suhankoh.dagger2sandbox.dagger.TestLib;

import javax.inject.Inject;

public class MainActivity extends Activity {
    @Inject TestLib lib;

    private ApplicationComponent mComponent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ((DemoApplication) getApplication()).getComponent().inject(this);
        mComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this.getApplication()))
                .build();

        mComponent.inject(this);

        Toast.makeText(this, lib.getSecret(), Toast.LENGTH_LONG).show();
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
