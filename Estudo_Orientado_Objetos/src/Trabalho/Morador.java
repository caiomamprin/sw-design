package Trabalho;

import java.util.Date;

public class Morador {
		private String nome;
		private String cpf;
		private String rg;
		private double renda = 0;
		private Date dataNascimento;
		
		public Morador (String nome, String cpf, String rg, double renda, Date dataNascimento) {
			this.nome = nome;
			this.cpf = cpf;
			this.rg = rg;
			this.renda = renda;
			this.dataNascimento = dataNascimento;
		}
		
		public Date idade() {
			Date idade = new Date(System.currentTimeMillis());
			
			return idade;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getRg() {
			return rg;
		}
		public void setRg(String rg) {
			this.rg = rg;
		}
		public double getRenda() {
			return renda;
		}
		public void setRenda(double renda) {
			this.renda = renda;
		}
		public Date getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(Date dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		
}
