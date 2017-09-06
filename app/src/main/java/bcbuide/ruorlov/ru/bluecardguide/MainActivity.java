package bcbuide.ruorlov.ru.bluecardguide;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends MenuActivity {

    TextView aboutContent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buildToolbar();
        aboutContent = (TextView)findViewById(R.id.bluecard_system_content);
        aboutContent.setText(Html.fromHtml(String.valueOf(aboutContent.getText())), TextView.BufferType.SPANNABLE);
        aboutContent.setMovementMethod(LinkMovementMethod.getInstance());
        aboutContent.setLinksClickable(true);
    }


}
