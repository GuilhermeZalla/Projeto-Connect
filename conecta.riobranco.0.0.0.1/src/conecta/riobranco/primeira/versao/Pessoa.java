package conecta.riobranco.primeira.versao;
  public abstract class Pessoa{
    
     private String nome;
     private String nomeSocial;
     private int idade;
     private char sexo;
     private String dataDeNascimento;
     private int numeroCelular;
     private int cep;
     private String endereco;
     private int numero;
     private String complemento;
     private String bairro;
     private String cidade;
     private String uf;
     private String unidade;
     private String curso;
     private boolean portadorDeficiência;
     private boolean aceitarReceberPublicidade;
     
 public Pessoa(String nome, int idade, char sexo){
     this.nome = nome;
     this.idade = idade;
     this.sexo = sexo;
 }
    
 public String getNome(){
     return nome;
 }
 
 public void setNome(String nome){
     this.nome = nome;
 }
 
 public String getEndereco(){
     return endereco;
 }
 
 public void setEndereco(String endereco){
     this.endereco = endereco;
 }  
  
 public int getNumero(){
     return numero;
 }
  
 public void setNumero(int numero){
     this.numero = numero;
 }
  
 public String getCidade(){
     return cidade;
 }
  
 public void setCidade(String cidade){
     this.cidade = cidade;
 }
   
 public String getUf(){
     return uf;
 }
    
 public void setUf(String uf){
     this.uf = uf;
 }
    
 public String getUnidade(){
     return unidade;
 }
    
 public void setUnidade(String unidade){
     this.unidade = unidade;
 }
 
 public String getCurso(){
     return curso;
 }
  
 public void setCurso(String curso){
     this.curso = curso;
 }
  
 public boolean getportadorDeficiencia(){
     return portadorDeficiência;
 }
    
 public void setPortadorDeficiencia(boolean portadorDeficiência){
     this.portadorDeficiência = portadorDeficiência;
 }
 
 public String getComplemento(){
     return complemento;
 }
    
 public void setComplemento(String complemento){
     this.complemento = complemento;
 }
 
 public String getBairro(){
     return bairro;
 }
  
 public void setBairro(String bairro){
     this.bairro = bairro;
 }
  
 public int getCep(){
     return cep;
 }
    
 public void setCep(int cep){
     this.cep = cep;
 }
    
 public String getNomeSocial(){
     return nomeSocial;
 }
  
 public void setNomeSocial(String nomeSocial){
     this.nomeSocial = nomeSocial;
 }
    
 public boolean getAceitarReceberPublicidade(){
     return aceitarReceberPublicidade;
 }
  
 public void setAceitarReceberPublicidade(boolean aceitarReceberPublicidade){
     this.aceitarReceberPublicidade = aceitarReceberPublicidade;
 }
 
 public int getNumeroCelular(){
     return numeroCelular;
 }
    
 public void setNumeroCelular(int numeroCelular){
     this.numeroCelular = numeroCelular;
 }
  
 public String getDataDeNascimento(){
     return dataDeNascimento;
 }
    
 public void setDataDeNascimento(String dataDeNascimento){
     this.dataDeNascimento = dataDeNascimento;
 }
 
 public int getIdade(){
     return idade;
 }
 
 public void setIdade(int idade){
     this.idade = idade;
 }
 
 public char getSexo(){
     return sexo;
 }
    
 public void setSexo(char sexo){
     this.sexo = sexo;
 }
}
