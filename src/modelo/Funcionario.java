package modelo;

import java.util.Date;

public class Funcionario {

	private Integer codigo;
	private Double salario;
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
