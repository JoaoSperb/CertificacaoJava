class Pessoa{
    static int id = 0;
    public Pessoa(){
        id++;
    }
}
public class Teste1{
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.println(p.id);
        Pessoa p2 = new Pessoa();
        System.out.println(p2.id);
    }
}