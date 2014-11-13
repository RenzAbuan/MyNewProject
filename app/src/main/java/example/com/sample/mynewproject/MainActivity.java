package example.com.sample.mynewproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    int counter;
    Button history,roster;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    /** Called when the user clicks the Send button */
    public void tigerHistory(View view) {
        // Do something in response to button
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://en.wikipedia.org/wiki/UST_Growling_Tigers"));
        startActivity(intent);
      //  Intent intent = new Intent(this, historypage.class);
      //  startActivity(intent);
    }

    public void teamRoster(View view) {
        // Do something in response to button
        Intent ros = new Intent("example.com.sample.mynewproject.ROSTERMENU");
        startActivity(ros);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.home) {
            Intent intent2 = new Intent("example.com.sample.mynewproject.MENU");
            startActivity(intent2);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
}
