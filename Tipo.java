public abstract class Tipo {
    protected String porta;
    protected String nome;

    public Tipo(String porta, String nome) {
        this.porta = porta;
        this.nome = nome;
        System.out.printf("Estou escutando na porta %s \n", this.porta);
    }

    public abstract void run() {
        //Método herdado e implementado pelos filhos;
    }

}