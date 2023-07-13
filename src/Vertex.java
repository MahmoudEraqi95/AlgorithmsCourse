import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private State label = State.UNEXPLORED;
    private int key;
    List<Edge> edges = new ArrayList<>();
    public Vertex(int key){
        this.key = key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setLabel(State label) {
        this.label = label;
    }

    public int getKey() {
        return key;
    }

    public State getLabel() {
        return label;
    }
}
