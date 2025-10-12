public class Conta {
    
    private int nconta;
    private String nome;
    private double saldo;
    private boolean contaAtiva;

    public Conta(int nconta,String nome){
        this.nconta = nconta;
        this.contaAtiva = true;
        this.nome = nome;
        this.saldo = 0;
    }
    public int getnconta(){
        return nconta;
    }
    public String getnome(){
        return nome;
    }
    public double getsaldo(){
        return saldo;
    }
    public boolean getcontaAtiva(){
        return contaAtiva;
    }
    public void setnconta(int novaConta){
        nconta = novaConta;
    }
    public void setcontaAtiva(boolean novacontaAtiva){
        contaAtiva = novacontaAtiva;
    }
    public void setnome(String novoNome){
        nome = novoNome;
    }
    public void setsaldo(double novoSaldo){
        saldo = novoSaldo;
    }

    public void Depositar(double valor){
        if(contaAtiva){
            if(valor > 0 && saldo >=0){
                saldo = valor;
                System.out.println("depósito realizado no valor de:"+ saldo + " reais na conta.");
            }else{
                System.out.println("valor inválido,coloque valor positivo.");
            }
        }else{
            System.out.println("conta inoperável.");
        }
    }
    public void Sacar(double valor){
        if(contaAtiva){
            if(valor <= saldo){
                saldo = saldo - valor;
                System.out.println("foi sacado " + saldo + " reais na sua conta");
            }else{
                System.out.println("Saque insuficiente");
            }
        }else{
            System.out.println("Conta Desativada");
        }
    }
    public void Desativar(){
        if(contaAtiva){
            contaAtiva = false;
            System.out.println("Conta Desativada");
        }else{
            System.out.println("conta ainda Ativada");
        }
    }
    public void Ativar(){
        if(contaAtiva){
            contaAtiva = true;
            System.out.println("Conta Ativada");
        }else{
            System.out.println("Conta ainda Desativada");
        }
    }

    public String toString(){
        String result = contaAtiva ? "ativa" : "desativado";
        return String.format("senhor(a) %s com a conta N° %d está com a conta %s com o saldo de %.2f",nome,nconta,result,saldo);
    }

    public void exibir(){
        System.out.println(toString());
    }
} 
        
