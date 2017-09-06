package bcbuide.ruorlov.ru.bluecardguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MenuActivity extends AppCompatActivity {
    Intent intent;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.bluecard_system:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.who_can_get:
                intent = new Intent(this, WhoCanActivity.class);
                startActivity(intent);
                return true;
            case R.id.can_i_qualify:
                intent = new Intent(this, CanIQualify.class);
                startActivity(intent);
                return true;
            case R.id.list_of_specialties:
                intent = new Intent(this, ListOfSpecialities.class);
                startActivity(intent);
                return true;
            case R.id.close_app:
                finishAffinity();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void buildToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}
