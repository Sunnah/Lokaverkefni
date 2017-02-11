package sunna.lagain;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.genre);
        Button button = (Button) findViewById(R.id.button);
        //setSupportActionBar(toolbar);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                CheckBox action = (CheckBox)findViewById(R.id.Action);
                CheckBox adventure = (CheckBox)findViewById(R.id.Adventure);
                CheckBox animation = (CheckBox)findViewById(R.id.Animation);
                CheckBox comedy = (CheckBox)findViewById(R.id.Comedy);
                CheckBox crime = (CheckBox)findViewById(R.id.Crime);
                CheckBox documentary = (CheckBox)findViewById(R.id.Documentary);
                CheckBox drama = (CheckBox)findViewById(R.id.Drama);
                CheckBox family = (CheckBox)findViewById(R.id.Family);
                CheckBox fantasy = (CheckBox)findViewById(R.id.Fantasy);
                CheckBox horror = (CheckBox)findViewById(R.id.Horror);
                CheckBox music = (CheckBox)findViewById(R.id.Music);
                CheckBox mistery = (CheckBox)findViewById(R.id.Mistery);
                CheckBox romance = (CheckBox)findViewById(R.id.Romance);
                CheckBox scifi = (CheckBox)findViewById(R.id.SciFi);
                CheckBox thriller = (CheckBox)findViewById(R.id.Thriller);
                CheckBox western = (CheckBox)findViewById(R.id.Western);
                Connection dbConnection = new Connection();
                ArrayList <String> actors = dbConnection.getActors(action.isChecked(), adventure.isChecked(), animation.isChecked(),
                        comedy.isChecked(), crime.isChecked(), documentary.isChecked(), drama.isChecked(),
                        family.isChecked(), fantasy.isChecked(), horror.isChecked(), music.isChecked(), mistery.isChecked(),
                        romance.isChecked(), scifi.isChecked(), thriller.isChecked(), western.isChecked());
                setContentView(R.layout.keywords);


            }
        });
        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
        /*    @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
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
