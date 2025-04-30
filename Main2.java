import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main2 {
    public static void main(String[] args) {
        int numdecasos, posicion, num, suma;
        ArrayList<Integer> mayorderecha = new ArrayList<>();
        ArrayList<Integer> mayorizquierda = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        numdecasos = sc.nextInt();

        //782
        // 7*3+2
        for (int i =0; i < numdecasos;  i++){
            suma = 0;
            posicion = i;
            num = sc.nextInt();
            String numero = String.valueOf(num);
            for (int j = 0; j < numero.length(); j++){
                int numeroMayor = 0;
                int numeroMenor = Integer.MAX_VALUE;
                int numtemporal = Integer.parseInt(String.valueOf(numero.charAt(j)));
                if ((j+1) % 2 == 0){
                    for (int x = j-1; x >= 0; x--){
                        if (Integer.parseInt(String.valueOf(numero.charAt(x))) > numeroMayor) {
                            numeroMayor = Integer.parseInt(String.valueOf(numero.charAt(x)));
                        }
                    }
                    suma += numtemporal * 2 + numeroMayor;
                } else {
                    for (int x = j+1; x < numero.length(); x++){
                        if (Integer.parseInt(String.valueOf(numero.charAt(x))) < numeroMenor) {
                            numeroMenor = Integer.parseInt(String.valueOf(numero.charAt(x)));
                        }
                    }
                    suma += numtemporal * 3 + numeroMenor;
                }
            }
            System.out.println(suma);
        }

    }
}
