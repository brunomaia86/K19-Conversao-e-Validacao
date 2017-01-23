package modelo;

import java.util.Date ;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Funcionario {

	@NotNull(message="insira o codigo desejado!")
	@Min(value=5)
	@Max(value=19)
	private Integer codigo;
	
	@NotNull
	@Min(value=0)
	private Double salario;

	@NotNull
	private Date aniverssario;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getAniverssario() {
		return aniverssario;
	}

	public void setAniverssario(Date aniverssario) {
		this.aniverssario = aniverssario;
	}

}
