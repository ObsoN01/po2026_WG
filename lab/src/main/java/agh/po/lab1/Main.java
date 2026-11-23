public class Main {
    public static void main(String[] args) {
        final int DOMYSLNY_ROZMIAR = 9; // stała wersja bez argumentu
        int size = DOMYSLNY_ROZMIAR;

        if (args.length > 0) {
            size = Integer.parseInt(args[0]);
        }

        for (int i = 1; i <= size; i += 2) {
            for (int j = 0; j <= (size - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}