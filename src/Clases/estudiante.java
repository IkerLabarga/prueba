package Clases;
/**
 * 
 * @author dam107
 * @version 1.0
 */
public class estudiante extends persona{
	/**Inicializamos una variable para indicar el numero del curso a el cual pertenece
	 * @param nº del curso al que pertenecerá un alumno
	 */
	int i_Curso;
	/**Creamos una clase estudiante donde introducimos la edad, nombre y nº de curso*/
    	public estudiante() {
		i_Edad=25;
		s_Nombre = "Luis";
		i_Curso = 1;
	}
    	/**Método para que un alumno de sus datos(Nombre,curso y edad.) */
	public void presentarse(){
	System.out.println("Soy " + s_Nombre + " Alumno de " + Integer.toString(i_Curso) + " y 	tengo una edad de: " + Integer.toString(i_Edad));	
    	}
	/**Método para que el alumno se presente(metodo presentarse) devuelva un color 
	 * 
	 * @return devolvemos el objeto mipc(refiriendose a la clase ordenador, llamamos a la clase para asignar un color aleatorio)
	 */
	public String preguntacolor(){
		presentarse();
		ordenador mipc = new ordenador();
        	return mipc.color();
    	}
}
