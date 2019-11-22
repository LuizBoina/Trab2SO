import java.util.concurrent.ThreadLocalRandom;

public class Barbearia {
    public static void main(String[] args) {
        int qtdBarbeiros = Integer.parseInt(args[0]);
        int qtdCadeiras = Integer.parseInt(args[1]);
        int qtdClientes = Integer.parseInt(args[2]);

        Barbeiro[] barbeiros = new Barbeiro[qtdBarbeiros];
        int i;
        for (i = 0; i < qtdBarbeiros; i++) {
            barbeiros[i] = new Barbeiro(i+1);
             //Thread th =  new Thread(barbeiros[i]);
        }
        i = 0;

        while(i < qtdClientes) {
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(3000, 5000));
            } catch (InterruptedException e){}
            Cliente novoCliente = new Cliente(i++);
            if(/*qtdGntCortando == qtdBarbeiros || qtdGntNaFila == qtd qtdCadeiras*/) {
                System.out.println("Cliente "+ novoCliente.getID() +" terminou o corte… saindo da barbearia!");
            }
            else
                System.out.println("Cliente "+novoCliente.getID()+
                        " tentou entrar na barbearia, mas está lotada… indo dar uma voltinha");

        }
    }
}
