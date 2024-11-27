package ex_fixacao_2_entities;

public class PessoaJuridica extends Pessoa {
	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double valorImposto() {
		return numeroFuncionarios <= 10 ? getRendaAnual() * 0.16 : getRendaAnual() * 0.14;
	}
}
