package example.com.oiak;

import android.content.Context;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BubbleSort {


    int TAB_SIZE = 10000;
    /*
    do gorszej implementacji:
    - linkedList do przechowywania całego shitu (żeby cokolwiek znaleźć trzeba przelecieć całą)
    - najgłupsza implementacja algorytmu

    do lepszej implementacji:
    - najmądrzejszy z dostępnych algorytmów bąbelkowych
    - arrayList do przechowywania liczb

     */

    public BubbleSort() {
    }


    public void sortSilly(Context context) {
        System.out.println("sortSilly()");
        List<Integer> list = new LinkedList<Integer>();

        //to do wywalenia, jak się zrobi wczytywanie
        Random rand = new Random();
        for (int i = 0; i < TAB_SIZE; i++) {
            list.add(rand.nextInt());
        }

        for (int j = 0; j < TAB_SIZE - 1; j++)
            for (int i = 0; i < TAB_SIZE - 1; i++)
                if (list.get(i) > list.get(i + 1)) {
                    //Long temp = list.get(i);
                    int temp = new Integer(list.get(i));//srooogie wykorzystanie pamięci. Mam nadzieję
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }

        ReadData readData = new ReadData();
        readData.writeToFile(list, "dataOut", context);
    }

    public void sortWisely(Context context) {
        System.out.println("sortWisely()");
        List<Integer> list = new ArrayList<Integer>();

        Random rand = new Random();
        for (int i = 0; i < TAB_SIZE; i++) {
            list.add(rand.nextInt(10000));
        }
        Integer temp;       //mniej srogie wykorzystanie pamięci
        int changed;
        int min = 0, max = TAB_SIZE - 1;
        do {
            changed = -1;//etap3
            for (int i = min; i < max; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    if (changed < 0) {
                        min = i;
                    }
                    changed = i;
                }
            }
            if (min != 0) {//if(pmin) pmin--;
                min--;
            }
            max = changed;
            //    break;//jeśli nie było żadnej zmiany w przebiegu, zbiór jest posortowany.
        } while (changed >= 0);
        ReadData readData = new ReadData();
        readData.writeToFile(list, "dataOut", context);
    }

}
