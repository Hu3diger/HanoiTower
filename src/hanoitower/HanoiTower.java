import java.util.Scanner;

public class HanoiTower {


    public static void main(String[] args) {

        int nDiscos;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o número de discos: ");
        nDiscos = entrada.nextInt();

        HanoiTower.hanoi(nDiscos, 1, 3, 2);
    }
    private static void mover(int O, int D) {
        System.out.println("Estaca: "+O + " para: " + D);
    }


    static void hanoi(int nDiscos, int A, int B, int C) {

        if (nDiscos > 0) {
            hanoi(nDiscos - 1, A, C, B);
            mover(A, B);
            hanoi(nDiscos - 1, C, B, A);
        }

    }
}
