package pe.edu.tecsup.sintaxis.ejercicios;

public class EjerciciosOperadoresBooleanos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar lo siguiente
		//  1.-  Si hoy es viernes y es feriado no trabajamos
		boolean esViernes = true;
        boolean esFeriado = true;
        boolean noLaboral = esViernes && esFeriado;
        System.out.println("No Trabajamos :" + noLaboral);

        
        boolean hoyViernes=false, hoyFeriado=false;
    	boolean resultado = hoyViernes && hoyFeriado;
    	System.out.println("No trabajamos " + resultado);
		
		//  2.- Si llevo el curso de Java y tengo una IDE instalado
		//      podre realizar los laboratorios de clases
		
        
		
		//  3.- Si estudie en un instituto computacion o en una universidad
		//      ingenieri informatica podre trabajar en un departamento de TI   
		
	}

}
