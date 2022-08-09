import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("paranın miktarını giriniz: ");
        int para = input.nextInt();
        double kdv1 = 0.18,kdv2 = 0.8;

        boolean deger=para<1000;
        double result= deger ? ((para*kdv1)+para) : ((para*kdv2)+para);
        double kdvOran= deger ? kdv1 : kdv2;

        System.out.println("KDV: "+kdvOran);
        System.out.println("KDV'li fiyat: "+ result);
    }
}
