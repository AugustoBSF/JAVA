package classes;

public class Leao extends Animal{
    public Leao (String nome){
        super (nome);
    }
    @Override
    public String emitirSom(){
        return "Roooaaar";
    }
}
