import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Temav3 {
    public static void main(String args[]) {
//        exercitiuv2();
//       exercitiuv3();
          exercitiuv4();
    }

    public static void exercitiuv2() {
        int[][] myMatrixInt = {{1, 7, 3}, {10, 3, 4}, {1, 2, 9}};
        int numarLinii = 3;
        int numarColoane = 3;
        System.out.println("numerele impare sunt:");
        for (int i = 0; i < numarLinii; i++) {
            for (int j = 0; j < numarColoane; j++) {
                if (myMatrixInt[i][j] % 2 != 0) {
                    System.out.print(" " + myMatrixInt[i][j] + ", " );
                }
            }
        }
    }

    public static void exercitiuv3() {
        int[][] myMatrixInt = {{1, 7, 3}, {10, 3, 4}, {1, 2, 9}};
        int numarLinii = 3;
        int numarColoane = 3;
        System.out.println(" matricea inversata este: ");
        for (int i = myMatrixInt.length - 1; i >= 0; i--) {
            for (int j = numarColoane - 1; j >= 0; j--) {
                System.out.print( myMatrixInt[i][j] + " ,  ");
            }

               System.out.print("\n");

        }

    }

    public static void exercitiuv4 ()

    {
        int[][] myMatrixInt = {{1, 7, 3}, {10, 3, 4}, {1, 2, 9}};
        int numarLinii = 3;
        int numarColoane = 3;
        int par = 0;
        int impar = 0;
        for (int i = 0; i < numarLinii; i++) {
            for (int j = 0; j < numarColoane; j++) {
                if ( myMatrixInt[i][j] % 2 == 0 ){
                    par++;
                }
                 if ( myMatrixInt[i][j] % 2 != 0) {
                     impar++;
                 }

            }

        }
        {
            System.out.println("numere pare:" + par++ + " numere impare:" + impar++);
        }

    }
}


