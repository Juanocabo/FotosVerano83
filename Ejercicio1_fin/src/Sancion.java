
public class Sancion {

	String fecha,motivo;
	String importe;
	public Sancion(String fecha, String motivo, String importe) {
		this.fecha=fecha;
		this.motivo=motivo;
		this.importe=importe;
	}
	public Sancion(String entrada) {
		fecha=entrada.substring(entrada.indexOf(".")+1,entrada.indexOf("|"));
		entrada=entrada.substring(entrada.indexOf("|")+1,entrada.length());
		motivo=entrada.substring(0,entrada.indexOf("|"));
		importe=entrada.substring(entrada.indexOf("|")+1,entrada.indexOf(";"));
	}
	
	public String toString() {
		
		String salida="."+fecha+"|"+motivo+"|"+importe+";";
		
		return salida;
		
	}
}