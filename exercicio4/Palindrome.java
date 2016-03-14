public class Palindrome {

  public static void main(String[] args){
    
    boolean bool = false;
    String texto = args[0];
    String teste = "";
		int i;
    int tamanhoPalindrome = 5;
    int size = texto.length();
    int qtdTeste = size-tamanhoPalindrome;
		String reverso;
		
    for(i=0; i<=qtdTeste; i++){

      teste = texto.substring(i,i + tamanhoPalindrome);
        
      StringBuffer txtrever = new StringBuffer(teste);
      txtrever.reverse();
			reverso = txtrever.toString();

      if (teste.equals(reverso)) {
        System.out.println("Existe um Palíndrome: " + teste);
				System.out.println("Está na posição: (" + (i+1) + "," + (i + tamanhoPalindrome) + ")");
        bool = true;
				System.exit(0);
      }
		}	

    if (bool == false) {
      System.out.println("Não existe Palíndrome!!!");
    }
    
  }
}
