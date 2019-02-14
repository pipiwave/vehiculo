package app_vehiculo;

public class Uso_Vehiculo {

	public Uso_Vehiculo() {

	}

	public static void main(String[] args) {
		Vehiculo micoche = new Vehiculo(4, 2000, "azul", true);

		// System.out.println("mi coche es de color " + micoche.getColor()+" y tiene "+
		// micoche.getRuedas()+" ruedas y "+ micoche.tomAire() );

		System.out.println(micoche.DatosVehiculo());

	}

}
