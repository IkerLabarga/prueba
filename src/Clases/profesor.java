package Clases;
/**Metodo por el cual 
 * @author dam107
 * @version 1.0
 */
public class profesor  extends persona{
	/**
	 * Contructor para la clase
	 */
    	public profesor() {}				

	/**Método por el cual se pregunta el color al alumno, el cual ya ha sido asignado con preguntacolor()
	 * 
	 * @return devuelve el color guardado por el alumno
	 */
    	public String preguntacolor(){

		estudiante alumno = new estudiante();
		String colorRec = alumno.preguntacolor();
		return colorRec;
    	}
}
