package example.com.oiak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart = (Button) findViewById(R.id.button);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGeneratingData(v);
            }
        });
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
