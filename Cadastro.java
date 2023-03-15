public class Cadastro {
    private String Nome;
    private int Codigo;

    private int Quantidade;

    public void setNome (String Nome){
        this.Nome = Nome;
    }

    public String getNome(){
        return Nome;
    }

    public void setCodigo (int codigo){
        this.Codigo = codigo;
    }

    public double getCodigo(){
        return Codigo;
    }

    public void setQuantidade (int Quantidade){
        this.Quantidade = Quantidade;
    }
    public int getQuantidade(){
        return Quantidade;
    }

    public void sub(int n1){
        Quantidade = Quantidade - n1;

    }

}