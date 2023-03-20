import java.util.Scanner;

public class Reto2 {
    public class Ejercicio53 {
        
        public static void main(String[] args) {
        int numNada,con;
        double tiemGana= 120;
        double tiemSegunPu= 180;
        double tiemTerPu= 300;
        String nomGana="";
        String nomSegunPu="";
        String nomTerPu="";

        Scanner lectura=new Scanner(System.in);
        
        System.out.println(" Ingrese la cantidad de competidores: ");
        numNada=lectura.nextInt();
        lectura.nextLine();
            String[] nom=new String[numNada];
            double[] tiem=new double[numNada];
        for (con = 1; con <= numNada; con++) {
            System.out.println(" Informacion del competidor " + con);
            System.out.println(" Ingrese el nombre del competidor: " );
            nom[con]=lectura.nextLine();
            System.out.println(" Ingrese el tiempo del competidor: " );
            tiem[con]=lectura.nextDouble();
            
            if (tiem[con] < tiemGana) {
                nomTerPu = nomSegunPu;
                tiemTerPu = tiemSegunPu;
                nomSegunPu = nomGana;
                tiemSegunPu = tiemGana;
                nomGana = nom[numNada];
                tiemGana = tiem[con];
            } else if (tiem[con] < tiemSegunPu) {
                nomTerPu = nomSegunPu;
                tiemTerPu = tiemSegunPu;
                nomSegunPu = nom[numNada];
                tiemSegunPu = tiem[con];
            }else if (tiem[con] < tiemTerPu) {
                nomTerPu = nom[numNada];
                tiemTerPu = tiem[con];
            } 
        }
        for (int p = 0; p<numNada; p++) {
            System.out.println("Nombre " + nom[p] + "Tiempo " + tiem[p]);
        }

        System.out.println("El ganador fue " + nomGana + " con un tiempo de " + tiemGana);
        System.out.println("El segundo puesto fue " + nomSegunPu + " con un tiempo de " + tiemSegunPu);
        System.out.println("El tercer puesto fue " + nomTerPu + " con un tiempo de " + tiemTerPu);
    }
}
}