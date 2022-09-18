package com.gelas;

public class kopi {
    public static void main(String[]args){
        /*
        System.out.println("Damai Sejahtera");
        System.out.println("First Name : " + args[0]);
        System.out.println("Midle Name " + args[1]);
        System.out.println("Last Name : " + args[2]);
        */

        //Ini adalah tipedata
        byte b = 10;
        System.out.println("*BYTE*");
        System.out.println("Nilai byte b = "+ ( b + 1 ));
        System.out.println("Nilai max = "+Byte.MAX_VALUE);
        System.out.println("Nilai min = "+Byte.MIN_VALUE);
        System.out.println("Ukuran byte = "+Byte.BYTES);
        System.out.println("Ukuran byte = "+Byte.SIZE);

        int i = 32;
        System.out.println("*INTEGER*");
        System.out.println("Nilai integer i = "+ ( i + 1 ));
        System.out.println("Nilai max = "+Integer.MAX_VALUE);
        System.out.println("Nilai min = "+Integer.MIN_VALUE);
        System.out.println("Ukuran Integer = "+Integer.BYTES);
        System.out.println("Ukuran Integer = "+Integer.SIZE);

        short s = 16;
        System.out.println("*SHORT*");
        System.out.println("Nilai short i = "+ ( s + 1 ));
        System.out.println("Nilai max = "+Short.MAX_VALUE);
        System.out.println("Nilai min = "+Short.MIN_VALUE);
        System.out.println("Ukuran short = "+Short.BYTES);
        System.out.println("Ukuran short = "+Short.SIZE);

        long l = 64;
        System.out.println("*LONG*");
        System.out.println("Nilai integer i = "+ ( l + 1 ));
        System.out.println("Nilai max = "+Long.MAX_VALUE);
        System.out.println("Nilai min = "+Long.MIN_VALUE);
        System.out.println("Ukuran Long = "+Long.BYTES);
        System.out.println("Ukuran Long = "+Long.SIZE);

        float f = -4.5f;
        System.out.println("*FLOAT*");
        System.out.println("Nilai float i = "+ ( f + 1 ));
        System.out.println("Nilai max = "+Float.MAX_VALUE);
        System.out.println("Nilai min = "+Float.MIN_VALUE);
        System.out.println("Ukuran Float = "+Float.BYTES);
        System.out.println("Ukuran Float = "+Float.SIZE);

        double d = -8.5d;
        System.out.println("*DOUBLE*");
        System.out.println("Nilai double i = "+ ( d + 1 ));
        System.out.println("Nilai max = "+Double.MAX_VALUE);
        System.out.println("Nilai min = "+Double.MIN_VALUE);
        System.out.println("Ukuran Double = "+Double.BYTES);
        System.out.println("Ukuran Double = "+Double.SIZE);


        byte a = 123;
        System.out.println("Nilai dari a adalah " + a);

        //Ini menggunakan printformat
        byte x = 34;
        System.out.printf("Nilai dari x = %d \n",x);
        int z = 124;
        System.out.printf("Nilai dari z = %d \n",z);

        //ini menggunakan tipe data float dan double
        float t = 3;
        System.out.printf("Nilai dari t = %f \n",t);
        double y = 4;
        System.out.printf("Nilai dari y = %f \n",y);

        //ini adalah operator

        int health = 50;
        int damage = 2;
        int potion = 50;
        int buff = 3;
        int debuff = 2;
        int tambah = health+potion;
        int kurang = health-damage;
        int kali = damage*buff;
        int bagi = health/damage;
        System.out.printf("%d + %d = %d \n",health,potion,tambah);
        System.out.printf("%d - %d = %d \n",health,damage,kurang);
        System.out.printf("%d * %d = %d \n",damage,buff,kali);
        System.out.printf("%d / %d = %d \n",health,debuff,bagi);
        int g = 70;
        int h = 8;
        int gh = h%s;
        System.out.printf("%d %% %d = %d \n",g,h,gh);



    }

}
