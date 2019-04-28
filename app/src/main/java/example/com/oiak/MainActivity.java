package example.com.oiak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startGeneratingData(View view) {
        /* Do something in response to button.
         * 'Something' means doing lots of useless
         * computing*/
        BubbleSort bs = new BubbleSort();
        bs.sortSilly();

        bs.sortWisely();

    }
}
