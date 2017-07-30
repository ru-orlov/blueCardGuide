package bcbuide.ruorlov.ru.bluecardguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView aboutContent;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        aboutContent = (TextView)findViewById(R.id.bluecard_system_content);
        aboutContent.setText(Html.fromHtml(String.valueOf(aboutContent.getText())), TextView.BufferType.SPANNABLE);
    }

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
                intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.who_can_get:
                intent = new Intent(MainActivity.this, WhoCanActivity.class);
                startActivity(intent);
                return true;
            case R.id.can_i_qualify:
                intent = new Intent(MainActivity.this, CanIQualify.class);
                startActivity(intent);
                return true;
            case R.id.list_of_specialties:
                intent = new Intent(MainActivity.this, ListOfSpecialities.class);
                startActivity(intent);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
