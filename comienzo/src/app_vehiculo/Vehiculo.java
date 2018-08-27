package app_vehiculo;

public class Vehiculo {

	private int ruedas;
	private int peso;
	private String color;
	private boolean aire;
	String acondicionado;
	
	public Vehiculo(int ruedas,int peso,String color, boolean aire) {
		
		this.ruedas = ruedas;
		this.peso = peso;
		this.color = color;
		
		if(aire==true) {
			
			this.aire = aire;
			acondicionado = "tiene aire acondicionado";
		}else{
			
			this.aire = aire;
			acondicionado= "no tiene aire acondicionado";
		}
		
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}


	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isAire() {
		
		return aire;
	}

	public void setAire(boolean aire) {
		
		this.aire = aire;
	}
	
	public String tomAire() {
		
		if(this.aire==true) {
			
			return "tiene aire";
		}else{
			return "no tiene aire";
		}
	}
	
	public String DatosVehiculo() {
		
		
		return "mi vehiculo tiene "+ruedas+" ruedas, pesa "+peso+" kilos, es de color "+color+
				" y "+acondicionado;
	}

}
