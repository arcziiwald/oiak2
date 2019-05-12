package example.com.oiak;

import android.content.Context;
import android.util.Log;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class ReadData {

    public void readFromFile(String pathToFile) throws FileNotFoundException {
        DataInputStream reader = new DataInputStream(new FileInputStream(pathToFile));
        try {
            float result = reader.readFloat();
            Log.e("Result", String.valueOf(result));
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(List<Integer> data, String filename, Context context) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput(filename + ".txt", Context.MODE_PRIVATE));
            for (int i = 0; i < data.size(); i++) {
                outputStreamWriter.append(String.valueOf(data.get(i)));
            }
            outputStreamWriter.close();
        } catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }
}
