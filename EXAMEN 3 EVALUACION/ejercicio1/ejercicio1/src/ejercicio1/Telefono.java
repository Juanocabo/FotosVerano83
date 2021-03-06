package ejercicio1;
/**
 * 
 * @author Juan Ocabo
 * La clase telefono solo contendra el numero y el tipo de ese numero.
 *
 */
public class Telefono {

	String numero,tipo;
	public Telefono(String numero, String tipo) {

		this.numero=numero;
		this.tipo=tipo;

	}

	//constructor para cuando se obtiene del fichero
	public Telefono(String entrada) {

		fromString(entrada);
	}

	public String toString() {

		return tipo+"_"+numero;

	}

	//este metodo cogera como parametro un string en formato fichero y lo dividira en los atributos de la clase Telefono
	private void fromString(String entrada) {

		tipo=entrada.substring(1,entrada.indexOf("_"));
		numero=entrada.substring(entrada.indexOf("_")+1,entrada.length()-1);

	}
	
	//determina si un numero de telefono cumple con las normas expuestas en el examen true si es valido
	public static boolean telefonoValido(String numero) {
		
		for(int i = 0 ; i < numero.length() ; ++i) {
			
			if((numero.charAt(i)<'0' || numero.charAt(i)>'9') && 
					numero.charAt(i)!='+' && numero.charAt(i)!=' ')return false;
			
		}
		return true;
		
	}
	
}
