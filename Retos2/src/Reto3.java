public class Reto3 {
    public static void main(String[] args) {
        String[][]tecla={{"Esc ","F1 ","F2 ","F3 ","F4 ","F5 ","F6 ","F7 ","F8 ","F9 ","F10 ","F11 ","F12 ","Impr Pant ","Bloq Despl ","Pausa "," "," "," "," "," "," "},
        {"| ","1 ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","0 ","? ","¿ ","BORAR ","Insert ","Inicio ","RePág ","Bloq Num ","/ ","* ","- "},
    {"TABULADOR ","Q ","W ","E ","R ","T ","Y ","U ","I ","O ","P ","¨ ","~ ","ENTER ","Supr ","Fin ","AvPág ","7 ","8 ","9 ","+ "},
    {"Bloq Mayús ","A ","S ","D ","F ","G ","H ","J ","K ","L ","Ñ ","[]{} ","4 ","5 ","6 "," "," "," "," "," "," "},
    {"SHIFT ","<> ","Z ","X ","C ","V ","B ","N ","M ","; ",".: ","- ","FLECHA ARRIBA ","1 ","2 ","3 "," "," "," "," "," "},
    {"Control ","Fn ","Windows ","Alt ","ESPACIO " ,"Alt Gr ","FLECHA IZQUIERDA ","FLECHA ABAJO ","FLECHA DERECHA ","0 ","Intro "," "," "," "," "," "," "," "," "," "," "}};

    for (int i=0;i<6;i++) {
        for (int j=0;j<21;j++) {
            System.out.print(tecla[i][j]);
        }
        System.out.println(" ");
    }
    }
}