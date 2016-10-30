/**
 * Created by kiosk on 30.10.16.
 */
public class Massive1 {
    public static void main(String[] args) {
        int i; int j;
        int [][] a = new int [5][7];


        for ( i = 0; i <a.length ; i++) {
            for ( j = 0; j <a.length; j++) {
            a[i][j]=i*a.length+j;
                System.out.print(' ');
                System.out.print(a[i][j]);

            }

        }

    }
}
