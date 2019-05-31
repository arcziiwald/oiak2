package example.com.oiak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSilly;
    private Button btnWisely;
    private Button btnGenerate;
    private EditText numberOfElements;
    private ProgressBar progressBar;
    private Button btnGC;
    ReadData readData;
    BubbleSort bs = new BubbleSort();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        readData = new ReadData();

        btnSilly = (Button) findViewById(R.id.btnSilly);
        btnWisely = (Button) findViewById(R.id.btnWisely);
        btnGC = (Button) findViewById(R.id.btnGC);
        btnGenerate = (Button) findViewById(R.id.btnGenerate);
        numberOfElements = (EditText) findViewById(R.id.numberOfElements);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGeneratingData(Integer.valueOf(numberOfElements.getText().toString()));
            }
        });

        btnSilly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSortSilly();
            }
        });

        btnWisely.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSortWisely();
            }
        });
    }

    public void startGeneratingData(int numOfElements) {
        bs.generateData(numOfElements);
        Toast.makeText(getApplicationContext(), "Generating data finished.", Toast.LENGTH_LONG).show();
        System.gc();
    }

    public void startSortSilly() {
        bs.sortSilly();
        Toast.makeText(getApplicationContext(), "Sort silly finished.", Toast.LENGTH_LONG).show();
        System.gc();
    }

    public void startSortWisely() {
        bs.sortWisely(getApplicationContext());
        Toast.makeText(getApplicationContext(), "Sort wisely finished.", Toast.LENGTH_LONG).show();
        System.gc();
    }

    public void gcActivate() {
        System.gc();
    }
}
