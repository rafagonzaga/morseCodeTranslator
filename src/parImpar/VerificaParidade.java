package parImpar;

public class VerificaParidade {

    private long num;

    public VerificaParidade() {
    }

    public VerificaParidade(long num) {
        this.num = num;
    }

    public String verificarParidade() {
        if (this.num % 2 == 0) {
            return "O número é par";
        }
        return "O número é ímpar";
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }
}
