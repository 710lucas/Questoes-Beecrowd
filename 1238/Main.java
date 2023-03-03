import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qnt = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i<qnt; i++){

            String string1 = scan.nextLine();
            String string2 = scan.nextLine();
            String resultado;

            resultado = combinador2(string1, string2);



            System.out.print(resultado);

        }

    }

    public static String combinador(String string1, String string2){

        String resultado="";

        if(string1.length() > string2.length() || string1.length() == string2.length()) {
            for (int i = 0; i < string1.length(); i++) {
                if (i < string2.length()) {
                    resultado += string1.charAt(i);
                    resultado += string2.charAt(i);
                } else {
                    resultado += string1.charAt(i);
                }
            }
        }
        else if(string2.length() > string1.length()) {
            for (int i = 0; i < string2.length(); i++) {
                if (i < string1.length()) {
                    resultado += string1.charAt(i);
                    resultado += string2.charAt(i);
                } else {
                    resultado += string2.charAt(i);
                }
            }
        }

        return resultado;

    }

    public static String combinador2(String string1, String string2){

        String resultado="";

            for (int i = 0; i < maiorString(string1, string2); i++) {
                if ((i < string2.length() && string1.length()>string2.length()) || (i<string1.length() && string2.length()>string1.length()) || (string2.length() == string1.length())) {
                    resultado += string1.charAt(i);
                    resultado += string2.charAt(i);
                } else {
                    if(string1.length() > string2.length())
                        resultado += string1.charAt(i);
                    else if(string2.length() > string1.length())
                        resultado += string2.charAt(i);
                }
            }


        return resultado;

    }

    public static int maiorString(String string1, String string2){
        if(string1.length()>string2.length())
            return string1.length();
        return string2.length();
    }
}