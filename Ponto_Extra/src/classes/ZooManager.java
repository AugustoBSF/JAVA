package classes;
import java.util.List;
import java.util.ArrayList;
public class ZooManager {
    protected List<Animal> animal;
    public ZooManager(){
        this.animal = new ArrayList<>();
    }
    public void listaDeAnimais(){
        for (Animal ani : animal)
    }
}
