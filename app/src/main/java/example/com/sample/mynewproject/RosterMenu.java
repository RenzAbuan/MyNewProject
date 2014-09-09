package example.com.sample.mynewproject;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by notebook on 9/7/2014.
 */
public class RosterMenu extends ListActivity {
    String classes[] = {"KevinFerrer", "AljonMariano", "KarimAbdul", "JamilSheriff", "EdDaquioag" , "PauloPe" };
    String classes2[] = {"Kevin Ferrer", "Aljon Mariano", "Karim Abdul", "Jamil Sheriff", "Ed Daquioag", "Paulo Pe" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setListAdapter(new ArrayAdapter<String>(RosterMenu.this, android.R.layout.simple_list_item_1, classes2));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String collection = classes[position];
        try{
            Class ourClass= Class.forName("example.com.sample.mynewproject."+ collection);
            Intent ourIntent = new Intent(RosterMenu.this, ourClass);
            startActivity(ourIntent);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
 /*   @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String collection = classes[position];
        try{
            Class ourClass= Class.forName("example.com.sample.mynewproject."+ collection);
            Intent ourIntent = new Intent(RosterMenu.this, ourClass);
            startActivity(ourIntent);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
*/
}

