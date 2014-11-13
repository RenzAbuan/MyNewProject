package example.com.sample.mynewproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import example.com.sample.mynewproject.R;

public class VivaSantoTomas extends ActionBarActivity {
    MediaPlayer vivasan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viva_santo_tomas);
    }

    public void vivas(View view) {
        // Do something in response to button
        vivasan= MediaPlayer.create(VivaSantoTomas.this, R.raw.viva);
        vivasan.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.viva_santo_tomas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        vivasan.stop();
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent intent = new Intent("example.com.sample.mynewproject.MAINACTIVITY");
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
