package bcbuide.ruorlov.ru.bluecardguide;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class CanIQualify extends MenuActivity{

    TextView canIAuality;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.can_i_qualify);
        buildToolbar();
        canIAuality = (TextView)findViewById(R.id.can_i_qualify);
        canIAuality.setText(Html.fromHtml(String.valueOf(canIAuality.getText())), TextView.BufferType.SPANNABLE);
        canIAuality.setMovementMethod(LinkMovementMethod.getInstance());
        canIAuality.setLinksClickable(true);

    }
}
