package conecta.riobranco.primeira.versao;
 public class Usuário extends Pessoa{
    
     private String email;
     private int cpf;

 public Usuário(String nome, int idade, char sexo){
     super(nome, idade, sexo);
 }

 public String getEmail(){
     return email;
 }

 public void setEmail(String email){
     this.email = email;
 }
 
 public int getCpf(){
     return cpf;
 }
 
 public void setCpf(int cpf){
     this.cpf = cpf;
 }
}