import java.util.*;

//comment since github office PC
>>>>>>> f382f30b9fef75b477b4da5d8acd92aac02347f4
public class ejercicio1 
{
    public static void main(String[] args) 
    {
        Scanner entradas= new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String variable=entradas.nextLine();
        System.out.print("Proyecto 1 \n");
        System.out.printf(String.format("Hola %s %n",variable));
        System.out.printf("impresion de un flotante con limitacion en digitos de presicion %.2f %n",50.188976);
        entradas.close();

    }
    
}
