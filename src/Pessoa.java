public class Pessoa extends Thread{
    private int id;

    public Pessoa(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }
}
