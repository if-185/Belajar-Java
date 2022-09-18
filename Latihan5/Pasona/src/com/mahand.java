package com;

import jdk.swing.interop.SwingInterOpUtils;

public class mahand {
    public static void main(String[]args){
        System.out.println("Panji Sasono Imanuel");
        //Operator Unary

        //Operator yang digunakan pada satu variabel saja

        //Operator Unary + dan -
        int HP = 100;
        float Damage = 30;
        System.out.printf("Nilai HP = %d digunakan operator Unary + manjadi %d\n", HP, +HP);
        System.out.printf("Nilai Damage = %f digunakan operator unary - menjadi %f\n",Damage, -Damage);

        //Operator Unary Increment dan Decrement

        //Increment ++
        int a,b;
        a = 7;
        b = 10;
        System.out.println("Nilai a setelah Increment adalah " + ++a );
        System.out.println("Nilai b adalah " + b++);
        System.out.println("Nilai b yang sesungguhnya adalah " + b);

        //Decrement --
        int C,D;
        C = 5;
        D = 6;
        System.out.println("Nilai a setelah Increment adalah " + --C );
        System.out.println("Nilai b adalah " + D--);
        System.out.println("Nilai b yang sesungguhnya adalah " + D);

        //Unary Boolean !
        boolean Panji = true;
        System.out.println("Panji = "+ !Panji );

        //ARITMATIKA BIASA
        int u =3;
        int g = u-1;
        System.out.println("nilai g adalah "+ g);

        //ASSIGNMENT
        int w=7;
        w -= 2;
        System.out.println("nilai w adalah "+ w);

        //Operator Comparation

        int lvpedang=23;
        int lvzaki=20;
        int lvpasona=23;
        boolean status = lvpedang==lvzaki;
        System.out.println("Zaki bisa menggunakan pedang ini = "+ status);
        System.out.printf("Pasona bisa menggunakan pedang ini = %s ", lvpedang==lvpasona );

        //Comparation Than Less
        int z=23;
        int y=20;
        int x=23;
        boolean gg = z>y;
        System.out.println("apakah z lebih besar dari y? = "+ gg);
        System.out.printf("Pasona bisa menggunakan pedang ini = %s ", y==x );

/*
        int lvpedang=23;
        int lvzaki=20;
        int lvpasona=23;
        boolean status = lvpedang==lvzaki;
        System.out.println("Zaki bisa menggunakan pedang ini = "+ status);
        System.out.printf("Pasona bisa menggunakan pedang ini = %s ", lvpedang==lvpasona );


        int lvpedang=23;
        int lvzaki=20;
        int lvpasona=23;
        boolean status = lvpedang==lvzaki;
        System.out.println("Zaki bisa menggunakan pedang ini = "+ status);
        System.out.printf("Pasona bisa menggunakan pedang ini = %s ", lvpedang==lvpasona );


        int lvpedang=23;
        int lvzaki=20;
        int lvpasona=23;
        boolean status = lvpedang==lvzaki;
        System.out.println("Zaki bisa menggunakan pedang ini = "+ status);
        System.out.printf("Pasona bisa menggunakan pedang ini = %s ", lvpedang==lvpasona );
*/
    Boolean kuku=true;
    Boolean koko=false;

        System.out.println(kuku||koko);
        System.out.println(kuku&&koko);
    }
}
