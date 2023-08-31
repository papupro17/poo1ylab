// Realizar operaciones matemáticas básicas

public class _p05_OperacionesMatematicas {
    public static void main(String[] args) {
        double x, y, suma, resta, mult, div, res, pot ;
        x=10.5; y=2.5;
        suma=x+y;
        resta=x-y;
        mult=x*y;
        div=x/y;
        res=x%y;
        pot=Math.pow(x,y);

        String format;
        System.out.println(String.format("Los numeros son: %.2f, %.2f",x,y));
        System.out.println(String.format("Suma : %.2f", suma ));
        System.out.println(String.format("Resta : %.2f", resta ));
        System.out.println(String.format("multiplicacion : %.2f", mult ));
        System.out.println(String.format("div : %.2f", div ));
        System.out.println(String.format("rest : %.2f", res ));
        System.out.println(String.format("pot : %.2f", pot ));
        

    }
    
}
