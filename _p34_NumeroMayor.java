import java.util.Scanner;

public class _p34_NumeroMayor {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.print("Dame tres numeros enteros\nh");
        Scanner obj = new Scanner(System.in);
        int num1,num2,num3;

        System.out.print("Dame el primer numero: "); num1 = obj.nextInt();
        System.out.print("Dame el segundo numero: "); num2 = obj.nextInt();
        System.out.print("Dame el tercer numero: "); num3 = obj.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero " + num1 + "es mayor a todos");

        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero " + num2 + "es mayor a todos");

        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El numero " + num3 + " es mayor a todos");

        } else {
            System.out.println("mmm... todos los numeros son iguales!");
        }
        

    

              


        
    }
    
}
