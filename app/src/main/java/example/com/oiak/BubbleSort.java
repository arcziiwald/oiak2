package example.com.oiak;

import android.content.Context;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BubbleSort {
    List<Double> list = new LinkedList<Double>();

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

    public void generateData(int numOfElements) {
        list.clear();
        Random r = new Random();
        for (int i = 0; i < numOfElements; i++) {
            System.out.println(String.valueOf(r.nextDouble()));
            list.add(r.nextDouble() + 65);
        }
    }

    public void sortSilly() {
        System.out.println("sortSilly()");

        double temp;
        for (int j = 0; j < list.size() - 1; j++) {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    //Long temp = list.get(i);
                    temp = new Double(list.get(i));//srooogie wykorzystanie pamięci. Mam nadzieję
                    System.gc();
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }
        }
    }

    public void sortWisely(Context context) {
        double temp;       //mniej srogie wykorzystanie pamięci
        int changed;
        int min = 0, max = list.size() - 1;
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
    }
}
