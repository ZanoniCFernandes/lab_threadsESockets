public class MultiPrograma {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Para executar o programa: Multiprograma <tipo> <identificador> <porta>");
            System.exit(0);
        }

        String tipo = args[0];
        String identificador = args[1];
        String porta = args[2];

        System.out.printf("Olá, eu sou o programa do tipo %s com o identificador %s \n", tipo, identificador);

        if(tipo.equals("produtor")) {
            Produtor p = new Produtor(porta, nome);
            p.run();
        } else if(tipo.equals("consumidor")) {
            Consumidor c = new Consumidor(porta, nome);
            c.run();
        } else {
            System.out.println("Tipo inválido");
        }
    }
}