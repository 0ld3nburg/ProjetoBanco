
public abstract class Administrador extends Funcionario implements Autenticavel{

    private int senha;

    public void setSenha(int Senha){
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }
}

