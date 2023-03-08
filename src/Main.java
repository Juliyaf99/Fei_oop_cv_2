import java.util.Scanner;

public class Main {

    public static int zodiak(int a,int b){
        int znak = 0;
        if (a>=21 && a<=31 && b == 3 || a>=1 && a<=19 && b == 4 ){
            znak = 1;
        }if (a>=20 && a<=30 && b == 4 || a>=1 && a<=20 && b == 5 ){
            znak = 2;
        }if (a>=21 && a<=31 && b == 5 || a>=1 && a<=20 && b == 6 ){
            znak = 3;
        }if (a>=21 && a<=30 && b == 6 || a>=1 && a<=22 && b == 7 ){
            znak = 4;
        }if (a>=23 && a<=31 && b == 7 || a>=1 && a<=22 && b == 8 ) {
            znak = 5;
        }if (a>=23 && a<=31 && b == 8 || a>=1 && a<=22 && b == 9 ) {
            znak = 6;
        }if (a>=23 && a<=30 && b == 9 || a>=1 && a<=22 && b == 10 ){
            znak = 7;
        }if (a>=23 && a<=31 && b == 10 || a>=1 && a<=21 && b == 11 ){
            znak = 8;
        }if (a>=22 && a<=30 && b == 11 || a>=1 && a<=21 && b == 12 ){
            znak = 9;
        }if (a>=22 && a<=31 && b == 12 || a>=1 && a<=19 && b == 1 ){
            znak = 10;
        }if (a>=20 && a<=31 && b == 1 || a>=1 && a<=18 && b == 2 ){
            znak = 11;
        }if (a>=19 && a<=29 && b == 2 || a>=1 && a<=20 && b == 3 ){
            znak =12;
        }
        switch(znak){
            case 1:
                System.out.println("Aries");
                break;
            case 2:
                System.out.println("Taurus");
                break;
            case 3:
                System.out.println("Gemini");
                break;
            case 4:
                System.out.println("Cancer");
                break;
            case 5:
                System.out.println("Leo");
                break;
            case 6:
                System.out.println("Virgo");
                break;
            case 7:
                System.out.println("Libra");
                break;
            case 8:
                System.out.println("Scorpio");
                break;
            case 9:
                System.out.println("Sagittarius");
                break;
            case 10:
                System.out.println("Capricorn");
                break;
            case 11:
                System.out.println("Aquarius");
                break;
            case 12:
                System.out.println("Pisces");
                break;
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        String s = "";

        while (!"2".equals(s)){
            System.out.println(" 1. Opakovane zistovat znamenia");
            System.out.println(" 2. Ukoncite program");
        }
        try {
            i = Integer.parseInt(s);
        } catch (NumberFormatException e){
            System.out.println("Chyba");
        }

        int a = 14;
        int b = 6;
        switch (i){
            case 1:

        }


    }
}