package tema52;

public class Conductor {

	public static void main(String[] args) {
		Trabajador tra = new Trabajador(1,2,"Juan","S","D");
		Trabajador tra1 = new Trabajador(2,3,"David","C","N");
		tra.VerTrabajador();
		tra.ModTrabajador();
		tra.VerTrabajador();
		tra.Salario();
		tra1.VerTrabajador();
		tra1.ModTrabajador();
		tra1.VerTrabajador();
		tra1.Salario();
	}

}
