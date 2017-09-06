package bcbuide.ruorlov.ru.bluecardguide;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ListOfSpecialities extends MenuActivity {

    TextView listOfSpecialities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_of_specialities);
        buildToolbar();
        listOfSpecialities = (TextView)findViewById(R.id.list_of_specialties);
        listOfSpecialities.setText(Html.fromHtml(String.valueOf(listOfSpecialities.getText())), TextView.BufferType.SPANNABLE);

    }
}
