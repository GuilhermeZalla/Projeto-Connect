package conecta.riobranco.primeira.versao;
 public class Vestibulando extends Usuário{
    
     private static String curso;
     private static int numeroInscrição;
     
 public Vestibulando(String nome, int idade, char sexo){
     super(nome, idade, sexo);
 }
    
 public String getCurso(){
     return curso;
 }  
  
 public void setCurso(String curso){
     this.curso = curso;
 }
 
 public int getNumeroInscricao(){
     return numeroInscrição;
 }
 
 public void setNumeroInscricao(int numeroInscrição){
     this.numeroInscrição = numeroInscrição;
 }  
 
 public void alterarDados(){
     
 }
 
 public void excluirConta(){
     
 }
 }