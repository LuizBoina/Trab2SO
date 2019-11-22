import java.util.concurrent.Semaphore;

public class Barbeiro extends Pessoa {

    private int cadeirasDisponiveis;
    private Semaphore clienteDisponivel;
    private Semaphore barbeiroDisponivel;

    public Barbeiro(int id) {
        super(id);
    }

    @Override
    public void run() {

    }
}
