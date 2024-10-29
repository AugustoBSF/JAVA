package classes;

public class Elefante extends Animal{
    public Elefante (String nome) {
        super(nome);
    }
@Override
public String emitirSom(){
    return "Prrrrrr!";
}
    }