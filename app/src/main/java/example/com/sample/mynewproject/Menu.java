package example.com.sample.mynewproject;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Menu extends ListActivity {
    String classes[] = {"USThymn", "VivaLaLigaElTomasino", "GoUSTe", "BlackGoldBlackWhite", "Spelling", "TigersReady", "VivaSantoTomas", "Chantra","BengBeng"};
    String classes2[] = {"UST Hymn", "Viva La Liga El Tomasino", "Go USTe", "Black Gold Black White", "Spelling", "Tigers Ready", "Viva Santo Tomas", "Chantra","Beng Beng"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes2));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String collection = classes[position];
        try{
            Class ourClass= Class.forName("example.com.sample.mynewproject."+ collection);
            Intent ourIntent = new Intent(Menu.this, ourClass);
            startActivity(ourIntent);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}
