package obernardovieira.androidfragmentsexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButtonToChange(View view)
    {
        RightDownFragment fragment = (RightDownFragment)
                getFragmentManager().findFragmentById(R.id.right_down_fragment);
        fragment.onClickButtonToChange();
    }
}
