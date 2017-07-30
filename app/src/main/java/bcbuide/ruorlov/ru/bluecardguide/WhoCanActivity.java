package bcbuide.ruorlov.ru.bluecardguide;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class WhoCanActivity extends Activity {

    TextView whoCanContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.who_can_content);

        whoCanContent = (TextView)findViewById(R.id.who_can_get_content);
        whoCanContent.setText(Html.fromHtml(String.valueOf(whoCanContent.getText())), TextView.BufferType.SPANNABLE);
    }
}
