package conecta.riobranco.primeira.versao;
 public class Login extends Vestibulando{
     
     private Vestibulando login;
     private String senha;
     
 public Login(String nome, int idade, char sexo){
        super(nome, idade, sexo);
 }  

 public Vestibulando getLogin(){
     return login;
 }

 public void setLogin(Vestibulando login){
     this.login = login;
 }

 public String getSenha(){
     return senha;
 }

 public void setSenha(String senha){
     this.senha = senha;
 } 
}