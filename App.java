import java.util.Arrays;
import java.util.Scanner;

//programa en Java que mediante una clave de sustitución encripta o desencripta un texto.
//clase app que tiene metodos de encriptar y desencriptar, así como de menú.
public class App {

    public static void encriptado() {

        //matriz de dos dimensiones que representa el abecedario y los datos a sustituir.
        char[][] abecedario = {{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'},
        {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}}; 

        System.out.println("\nIngrese la palabra clave:\n");
        Scanner myObj = new Scanner(System.in); 
        String input = myObj.nextLine();
        String inputvalue = input.toUpperCase();

        //iteración para remplazar la palabra clase dentro del array.
        for (int j = 0; j < inputvalue.length(); j++){
            abecedario[1][j] = inputvalue.charAt(j);
        }     
        int x = 0;
        for (int i = inputvalue.length(); i < abecedario[1].length; i++){
            abecedario[1][i] = abecedario[0][x];
            x++;
        }

        System.out.println("Abecedario de encriptado:\n");  
        System.out.println(Arrays.toString(abecedario[0]));
        System.out.println(Arrays.toString(abecedario[1]));

        System.out.println("\nIngrese el texto a encriptar:\n");
        Scanner myObj_1 = new Scanner(System.in); 
        String input2 = myObj_1.nextLine();
        String inputvalue2 = input2.toUpperCase();
        //myObj_1.close();

        //iteración para que los datos se encripten según el abecedario actual.
        System.out.println("\nTexto encriptado:\n");
        int n = 0;
        for (int j = 0; j < inputvalue2.length(); j++){
            if (inputvalue2.charAt(j) == abecedario[0][n]){
                System.out.print(abecedario[1][n]);
                n = 0;
            } else if (inputvalue2.charAt(j) == ' '){
                System.out.print(' ');
                n = 0;
            } else {
                n++;
                j-=1;
            }
        }
    }

    //este método realiza el mismo proceso pero al revés.
    public static void desencriptado() {

        char[][] abecedario = {{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'},
        {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}}; 

        System.out.println("\nIngrese la palabra clave:\n");
        Scanner myObj = new Scanner(System.in); 
        String input = myObj.nextLine();
        String inputvalue = input.toUpperCase();

        for (int j = 0; j < inputvalue.length(); j++){
            abecedario[1][j] = inputvalue.charAt(j);
        }      
        int x = 0;
        for (int i = inputvalue.length(); i < abecedario[1].length; i++){
            abecedario[1][i] = abecedario[0][x];
            x++;
        }

        System.out.println("Abecedario de encriptado:\n");  
        System.out.println(Arrays.toString(abecedario[0]));
        System.out.println(Arrays.toString(abecedario[1]));

        System.out.println("\nIngrese el texto a desencriptar:\n");
        Scanner myObj_1 = new Scanner(System.in); 
        String input2 = myObj_1.nextLine();
        String inputvalue2 = input2.toUpperCase();

        System.out.println("\nTexto desencriptado:\n");
        int n = 0;
        for (int j = 0; j < inputvalue2.length(); j++){
            if (inputvalue2.charAt(j) == abecedario[1][n]){
                System.out.print(abecedario[0][n]);
                n = 0;
            } else if (inputvalue2.charAt(j) == ' '){
                System.out.print(' ');
                n = 0;
            } else {
                n++;
                j-=1;
            }
        }
    }

    //el método menú se encarga de desplegar el menú con las diferentes opciones.
    public static void Menu() throws InterruptedException{

        System.out.println("\nBienvenido al sistema de encriptado de CryptoSegre S.A\n");
        Thread.sleep(750);
        
        int x = 0;
        while (x == 0) {

            System.out.println("\nSeleccione alguna de las siguiente opciones:\n");
            Thread.sleep(400);
            System.out.println("\n1. Encriptar\n\n2. Des-encriptar\n\n3. Salir\n");

            Scanner myObj = new Scanner(System.in); 
            String inputvalue = myObj.nextLine();

            //un switch para determinar la entrada del usuario, luego lanza el método correspondiente.
            switch (inputvalue) {
                case "1":
                    System.out.println("Proceso de encriptado\n");
                    encriptado();
                    break;
                
                case "2":
                    System.out.println("Proceso de desencriptado\n");
                    desencriptado();
                    break;

                case "3":
                    System.out.println("Saliendo...\n");
                    Thread.sleep(750);
                    x = 1;
                    break;
            }

        }

    }

    public static void main(String[] args) throws Exception {

        Menu();
    }
}
