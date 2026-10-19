package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;


public class LottoOpt {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> user_numbers = new ArrayList<>();
        Random r = new Random();
        long count = 0;

        int liczba_powt = 10;
        long czas = 0;

        for(int i = 0; i < 6; i++) {
            user_numbers.add(Integer.parseInt(args[i]));
        }
        for (int i=0; i < liczba_powt; i++) {
            long start = System.currentTimeMillis();
            while (true) {
                numbers.clear();
                int num_size = 0;

                while (num_size != 6) {
                    int num = r.nextInt(49 - 1 + 1) + 1;
                    if (!numbers.contains(num)) {
                        numbers.add(num);
                        num_size++;
                    }
                }
                numbers.retainAll(user_numbers);
                if (numbers.size() == 6) {
                    break;
                }

                count++;
            }
            czas += (System.currentTimeMillis() - start);
//            System.out.println(numbers);
//            System.out.println(user_numbers);
        }
        System.out.println("Czas: " + czas / liczba_powt);
        System.out.println("Liczba: " + count/liczba_powt);
    }

}
