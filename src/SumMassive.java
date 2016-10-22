package hw;

import com.sun.tools.corba.se.idl.constExpr.And;

/**
 * Created by kiosk on 22.10.16.
 */
public class SumMassive {

    public static void main(String[] args){

        int [] numbers=new int[args.length];
        for (int i = 0; i <args.length ; i++) {
            numbers[i]= Integer.parseInt(args[i]);
        }
        int x=0; int y=0;
        for (int i = 0; i <args.length ; i++) {

            if (numbers[i]>x) { x=numbers[i];
            }
            if (numbers[i]>y) { if (numbers[i]!=x)
             {
                y=numbers[i];
            }}
        }
        System.out.println(x+y);



    } }
