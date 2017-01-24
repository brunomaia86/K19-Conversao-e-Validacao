package controle;

import javax.annotation.ManagedBean;

import modelo.Funcionario;

@ManagedBean
public class FuncionarioBean {

	private Funcionario funcionario = new Funcionario();

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
		System.out.println(funcionario.getAniverssario());
	}

}
