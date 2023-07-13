import java.util.List;

public class Edge {
    State label = State.UNEXPLORED;
    List<Vertex> vertices;

    public Edge(List<Vertex> vertices){
        this.vertices = vertices;
    }

    public void setLabel(State label) {
        this.label = label;
    }

    public State getLabel() {
        return label;
    }
}
