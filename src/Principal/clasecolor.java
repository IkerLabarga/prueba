package Principal;
import Clases.profesor;
/**
 * El profesor pregunta a un alumno por un color (rojo, amarillo,verde)
 * @author dam107
 *@version 1.0	
 */
public class clasecolor {
	/** 
	 *@hidden
	 *@param args Main donde se crea un objeto profesor, se asigna el color a un alumno y se saca por pantalla el color.
	 */
	public static void main(String[] args) {
		profesor teacher = new profesor();
		String color = teacher.preguntacolor();
		System.out.println("La respuesta recibida es:" + color);
	} 
}
