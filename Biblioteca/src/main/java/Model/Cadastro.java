package Model;

public class Cadastro {
	 private Long idCadastro;
	 private String cpf;
	 private String nome;
	 private String email;
	 private String telefone;
	 private String login;
	 private String senha;
	 private Locacao locacao;
	 
	 public Cadastro() {
			
		}
	  
	 public Cadastro(Long idCadastro, String cpf, String nome, String email, String telefone, String login, String senha, Locacao locacao) {
			
			this.idCadastro = idCadastro;
			this.cpf = cpf;
			this.nome = nome;
			this.email = email;
			this.telefone = telefone;
			this.login = login;
			this.senha = senha;
			this.locacao = locacao;
	}
	 
	 public Long getidCadastro() {
		 return idCadastro;
	 }
	 public void setidCadastro(Long idCadastro) {
		 this.idCadastro = idCadastro;
	 }
	 
	 public String getcpf() {
		 return cpf;
	 }
	 public void setcpf(String cpf) {
		 this.cpf = cpf;
	 }
	 
	 public String getnome() {
		 return nome;
	 }
	 public void setnome(String nome) {
		 this.nome = nome;
	 }
	 
	 public String getemail() {
		 return email;
	 }
	 public void setemail(String email) {
		 this.email = email;
	 }
	 
	 public String gettelefone() {
		 return telefone;
	 }
	 public void settelefone(String telefone) {
		 this.telefone = telefone;
	 }
	 
	 public String getlogin() {
		 return login;
	 }
	 public void setlogin(String login) {
		 this.login = login;
	 }
	 
	 public String getsenha() {
		 return senha;
	 }
	 public void setsenha(String senha) {
		 this.senha = senha;
	 }	  
	 
	 public Locacao getlocacao() {
		 return locacao;
	 }
	 public void setlocacao(Locacao locacao) {
		 this.locacao = locacao;
	 }
}

