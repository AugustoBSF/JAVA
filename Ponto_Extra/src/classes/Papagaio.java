package classes;

public class Papagaio extends Animal{
    public Papagaio (String nome){
        super (nome);
    }
    @Override
    public String emitirSom(){
        return "Caw! Caw!";
    }

}
