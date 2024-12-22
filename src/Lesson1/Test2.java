package Lesson1;

public class Test2 {

    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 0xC;
        byte b3 = 0_14;
        byte b4 = 0b1100;

        short s1 = 1300;
        short s2 = 0x514;
        short s3 = 0_2424;
        short s4 = 0b0101_0001_0100;

        int i1 = 0;
        int i2 = 0x0;
        int i3 = 0_0;
        int i4 = 0b0;

        long l1 = 123_456_789L;
        long l2 = 0x75BCD15;
        long l3 = 0_726746425;
        long l4 = 0b0111010110111100110100010101;

        boolean bool1 = true;
        boolean bool2 = false;

        float f1 = 3.14F;
        float f2 = 4564.22123F;

        double d1 = 33333.33333;
        double d2 = 112323.3543453;

        char c1 = 'a';
        char c2 = '\u0061';

        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
        System.out.println(i1 + " " + i2 + " " + i3 + " " + i4);
        System.out.println(l1 + " " + l2 + " " + l3 + " " + l4);
        System.out.println(bool1 + " " + bool2);
        System.out.println(f1 + " " + f2);
        System.out.println(d1 + " " + d2);
        System.out.println(c1 + " " + c2);
    }

}
