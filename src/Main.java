import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //2d tömb létrehozássa(maga az alap)
        String[][] kocka = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        //
        boolean player1=true,hibas=false;
        boolean nyert=false;
        int a=0,b=0;
        kiir kiobj = new kiir();
        System.out.println("Üdvözöllek a Kör-X játékunkban!");

        System.out.println();

        //Oldal választás

        System.out.println("A körrel vagy X-szel szeretnél lenni? \n(Nyomj 0-át ha a körrel és 1-est ha az X-szel)");

        int oldalvalasztas = sc.nextInt();
        while (oldalvalasztas != 1) {
            if (oldalvalasztas > 1) {
                System.out.println("Rossz érték kérem válasszon a 0 és 1 érték között!");
                oldalvalasztas = sc.nextInt();
            }
            if (oldalvalasztas == 0) {

                System.out.println("Ön a kört választotta!");
                break;
            }
        }
        if (oldalvalasztas == 1) {

            System.out.println("Ön az X-et választotta!");
        }
        System.out.println();
        //kordináta bekérések


        while (nyert==false)
        {

            int teli=0;
            System.out.println("Kérem a sor kordinátáját 0 és 2 között: ");
            int kor1 = sc.nextInt();
            System.out.println("Kérem az oszlop kordinátáját 0 és 2 között: ");
            int kor2 = sc.nextInt();
            if (player1==true){
                kocka[kor1][kor2] = "x";
            }
            else{
                kocka[kor1][kor2] = "o";
            }
            if (hibas==false&&player1==true){
                player1=false;
            }
            else {
                player1=true;
            }
            kiobj.kiiras(kocka);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (kocka[i][j] == "-") {
                        teli=1 ;
                    }
                }
            }
            if(teli==0)
            {
                nyert=true;
            }
            if(player1==true)System.out.println("Az x következik!");
            else System.out.println("A kör következik!");
/*

            for (int i=0;i<3;i++)
            {
                for (int j=0;j<3;j++)
                {
                    if(kocka[i][j]=="x"){
                        a=i;
                        b=j;
                    }
                }
            }

            if(kocka[a][b]=="x")
            {
               if(kocka[0][0]==kocka[0][1]&& kocka[0][1]==kocka[0][2]||
                       kocka[0][0]==kocka[1][0]&& kocka[1][0]==kocka[2][0]||
                       kocka[0][0]==kocka[1][1]&& kocka[1][1]==kocka[2][2])
               {
                nyert=true;
               }
            }

*/
        }
    }
}

