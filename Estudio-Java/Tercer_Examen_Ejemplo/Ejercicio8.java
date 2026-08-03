public class Ejercicio8 {

    public static void main(String[] args) {
        int[][] estanteria = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 12, 22, 32, 42 },
                { 18, 28, 38, 48 }
        };

        int sumaDiagonal = 0;

        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[i].length; j++) {
                System.out.print(estanteria[i][j] + "\t");
                if (i == j) {
                    sumaDiagonal += estanteria[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("\nSuma de la diagonal principal: " + sumaDiagonal);
    }
}
