import java.util.Scanner;

public class Reto1{
   public static void main(String[] args) {

    int not;
    int sum=0;
    int prome=0;

     Scanner lectura=new Scanner(System.in);

     System.out.println("Ingrese la cantidad de notas a evaluar ");
     not=lectura.nextInt();

     int[] nota= new int[not];
     
     for (int i=0; i<nota.length; i++) {
        System.out.println("Ingrese la nota " +(i+1));
        nota[i]=lectura.nextInt();

        sum=nota[i]+sum;
        prome=sum/not;
     }
     System.out.println("El promedio total es: " + prome);
     if (prome<3) {
        System.out.println("Reprobo su nota es menor que 3");
     }else if (prome>3 && prome<4) {
        System.out.println("Tiene que mejor sus calificaciones para la proxima paso raspando");
     }else{
        System.out.println("Felicitaciones aprobo con buenas calificaciones");
     }
   }
}