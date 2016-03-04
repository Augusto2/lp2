public class Aluno {

  String nome; 
  String numeroMatricula;
  int idade;

  public void imprimirDadosCadastrais() {
    System.out.println("Nome:" +this.nome + " - Idade:" +this.idade + " - Matrícula:" +this.numeroMatricula);

  }
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno(); 
 		Aluno aluno2 = new Aluno();
 		Aluno aluno3 = new Aluno();
 		Aluno aluno4 = new Aluno();
 
 		aluno1.nome = "Augusto";
		aluno1.idade = 16;
 		aluno1.numeroMatricula = "201418110027";
 		aluno1.imprimirDadosCadastrais();

 		aluno2.nome = "Rafaela";
 		aluno2.idade = 16;
	 	aluno2.numeroMatricula = "20141810181";
 		aluno2.imprimirDadosCadastrais();

 		aluno3.nome = "Larissa";
 		aluno3.idade = 17;
 		aluno3.numeroMatricula = "201418110132";
 		aluno3.imprimirDadosCadastrais();

 		aluno4.nome = "Pedro";
 		aluno4.idade = 17;
 		aluno4.numeroMatricula = "201418110213";
 		aluno4.imprimirDadosCadastrais();
	}
}
