import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        int num;
        int colu;
        int fil;
        int sum=0;

        Scanner lectura=new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de fila");
        fil=lectura.nextInt();
        
        int[][] sodu=new int[fil][fil];

        for (int i = 0; i<fil; i++) {
            for (int j = 0; j<fil; j++) {
                System.out.println("Ingrese el valor de la fila" + (i+1));
                num=lectura.nextInt();
                sodu[i][j]=num;
            }
            System.out.println(" ");
        }
        for (int p = 0; p<fil; p++) {
            for (int x = 0; x<fil; x++) {
                System.out.println(sodu[p][x]);
            }
            System.out.println(" ");
        }
        for (int x = 0; x < fil; x++) {
            for (int y = 0; y<fil; y++) {
                sum=sodu[x][y]+sum;
                System.out.println("La suma de las filas es: ");
            }
        }
        for (int y = 0; y < fil; y++) {
            for (int x = 0; x<fil; x++) {
                sum=sodu[y][x]+sum;
                System.out.println("La suma de las columnas es: ");
            }
        }
    }
}
