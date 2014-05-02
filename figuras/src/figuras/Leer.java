
package figuras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Leer {

    
    @SuppressWarnings("finally")
	public static String pedirCadena()
    {
        InputStreamReader entrada=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(entrada);
        String cadenaLeida="fallo";
        try
        {
            cadenaLeida=teclado.readLine();
        }
        catch (IOException e)
        {
            System.out.println("HA HABIDO UN FALLO EN LA ENTRADA DE DATOS. NOS"  
                    + " SALIMOS DEL PROGRAMA ");
            System.exit(0);
        }
        finally
        {
            return cadenaLeida;
        }
        /*Aunque en el catch haya puesto un exit, me obliga a poner el return,
         * por eso lo pongo en el finally para que envíe una cadena, pase por 
         * donde pase
         */
    }
    
    public static int pedirEntero()
    {
        String cad;
        int num=0;
        boolean correcto=false;
        do
        {
            cad=pedirCadena();
            try {
                num=Integer.parseInt(cad);
                correcto=true;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Se ha insertado letras, en vez de números."
                        + "Por favor, inténtalo de nuevo");
            }
        }while (correcto==false);
        return num;
    }//Fin pedirEntero()
    
    @SuppressWarnings("finally")
	public static char pedirCaracter()
    {
        char cLeido=' ';
        InputStreamReader entrada=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(entrada);
         try
        {
            cLeido=(char)teclado.read();
        }
        catch (IOException e)
        {
            System.out.println("HA HABIDO UN FALLO EN LA ENTRADA DE DATOS. NOS"  
                    + " SALIMOS DEL PROGRAMA ");
            System.exit(0);
        }
        finally
        {
            return cLeido;
        }
        
    }//Fin pedirCaracter()
    
    public static float pedirReal()
    {
        String cad;
        float num=0;
        boolean correcto=false;
        do
        {
            cad=pedirCadena();
            try {
                num=Float.parseFloat(cad);
                correcto=true;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Se ha insertado letras, en vez de números."
                        + "Por favor, inténtalo de nuevo");
            }
        }while (correcto==false);
        return num;
    }//Fin pedirEntero()
    
    
}
