package PRACTICASCALIFICADAS.PracticaCalificadaN1;
/*
Se requiere crear una matriz donde solo se visualice la figura Z (zeta)
*/

public class Pregunta5 {
    public static void main(String[] args) {
        String zeta[][] = new String[6][6];

        for (int i = 0; i < zeta.length; i++) {
            for (int j = 0; j < zeta[0].length; j++) {
                zeta[i][j] = " ";
            }
        }

        System.err.println("Matriz Zeta \n");
         for (int i = 0; i < zeta.length; i++) {
            for (int j = 0; j < zeta[0].length; j++) {
                if ((i+j) == 5) {
                    zeta[i][j] = "*";
                }

                if ((i+j) == j ) {
                    zeta[i][j] = "*";
                }

                zeta[zeta.length - 1][j] = "*";
                System.err.print(zeta[i][j] + " ");
            }
            System.out.println("");
        }
       
    }
}
