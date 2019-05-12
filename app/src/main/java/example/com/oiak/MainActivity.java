package example.com.oiak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnStart;
    private Button btnSort;
    ReadData readData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        readData = new ReadData();

        btnStart = (Button) findViewById(R.id.button);
        btnSort = (Button) findViewById(R.id.btnSort);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSortSilly();
            }
        });

        btnSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSortWisely();
            }
        });
    }

    public void startGeneratingData(View view) {
        /* Do something in response to button.
         * 'Something' means doing lots of useless
         * computing*/
        BubbleSort bs = new BubbleSort();
        bs.sortSilly(getApplicationContext());
        bs.sortWisely(getApplicationContext());
    }

    public void startSortSilly() {
        BubbleSort bs = new BubbleSort();
        bs.sortSilly(getApplicationContext());
    }

    public void startSortWisely() {
        BubbleSort bs = new BubbleSort();
        bs.sortWisely(getApplicationContext());
    }
}
