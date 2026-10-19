package agh.po.lab2;

import java.util.ArrayList;
import java.util.Random;


public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> user_numbers = new ArrayList<>();
        Random r = new Random();
        int trafione = 0;
        int count = 0;

        int liczba_powt = 10;
        long czas = 0;

        for(int i = 0; i < 6; i++) {
            user_numbers.add(Integer.parseInt(args[i]));
        }
        for (int k=0; k < liczba_powt; k++) {
            long start = System.currentTimeMillis();
            while (trafione != 6) {

                trafione = 0;
                numbers.clear();
                int num_size = 0;

                while (num_size != 6) {
                    int num = r.nextInt(49 - 1 + 1) + 1;
                    int in_list = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        if (num == numbers.get(i)) {
                            in_list = 1;
                        }
                    }
                    if (in_list == 0) {
                        numbers.add(num);
                        num_size++;
                    }
                }
//            numbers.add(1);
//            numbers.add(2);
//            numbers.add(3);
//            numbers.add(4);
//            numbers.add(5);
//            numbers.add(6);
//            System.out.println(numbers);
//            System.out.println(user_numbers);

                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (numbers.get(i) == user_numbers.get(j)) {
                            trafione++;
                        }
                    }
                }
//            System.out.println(trafione);
                count++;
            }
//            System.out.println(numbers);
//            System.out.println(user_numbers);
            czas += (System.currentTimeMillis() - start);
        }
        System.out.println(count/liczba_powt);
        System.out.println(czas/liczba_powt);
        }

}
