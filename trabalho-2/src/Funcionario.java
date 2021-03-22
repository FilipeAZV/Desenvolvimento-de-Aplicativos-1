
public class Funcionario {

	// Atributos da classe
	private String Nome;
	private String Cargo;
	private String Matricula;
	private Double Salario;
	private Double HorasTrabalhadas;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	public Double getSalario() {
		return Salario;
	}

	public void setSalario( String salario) {
		Salario =  Double.parseDouble(salario);
	} 

	public Double getHorasTrabalhadas() {
		return HorasTrabalhadas;
	}

	public void setHorasTrabalhadas(String horasTrabalhadas) {
		HorasTrabalhadas = Double.parseDouble(horasTrabalhadas);
	}

	public String getDados() {
		
		String texto = "";		
		
		texto += "Nome: " + Nome + "\n";
		texto += "Cargo: " + Cargo + "\n";
		texto += "Matrícula: " + Matricula + "\n";
		texto += "Salário: " + Salario + "\n";
		
		return texto;
	}
		
	public void calcularHoraExtra() {

		if (HorasTrabalhadas > 200) {

			double HoraExtra;
			double ValorHora;
			double ValorExtra;

			HoraExtra = HorasTrabalhadas - 200;
			ValorHora = Salario / 200;
			ValorExtra = (ValorHora + (ValorHora * 0.5)) * HoraExtra;
			Salario += ValorExtra; // invés de colocar x = x + y fica x-= y
		}
	}
}
