package massive;

import Helpers.Helper;

import java.lang.reflect.Array;
import java.util.Arrays;


/**
 * Created by sergey on 23.10.16.
 */
public class Sort {
    public static void main(String[] args) {
        int [] a={4,3,26,2,7,5,1,8,6,2,10,7,9};
        Helper.printArray(a);

        Arrays.sort(a);

        Helper.printArray(a);

        for (int i = 0; i <a.length ; i++) {
            for (int j = a.length-1; j >i ; j--) {
                if (a[j]<a[j-1]){
                    int p;
                    p=a[j];
                    a[j]=a[j-1];
                    a[j-1]=p;
                }
            }

        }
        Helper.printArray(a);


    }
}
