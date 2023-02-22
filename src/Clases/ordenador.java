package Clases;
import java.util.Random;
/** El ordenador se utiliza para sacar un color aleatorio de los tres
 * 
 * @author dam107
 *
 */
public class ordenador {
	/**Construcor */
    public ordenador() {}
    /** Método para sacar un color aleatorio entre los 3 colores.
     * @return Dependiendo de que nº saque el generador, saldra o rojo,amarillo o verde.
     * */
    public String color(){
    	/** Creamos un generador aleatorio de el 0 al 2 */
    	Random randomGenerator = new Random();
	int randomInt = randomGenerator.nextInt(3);
	if(randomInt == 0)
	{  return "rojo";}
	else if(randomInt == 1)
	{ return "amarillo";}
	else
	{ return "verde";}
    }
}
