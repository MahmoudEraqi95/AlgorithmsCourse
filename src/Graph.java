import java.util.List;

public class Graph {
    List<Vertex> vertices;
    List<Edge> edges;

    public Graph(List<Vertex> vertices, List<Edge> edges) {
        this.vertices = vertices;
        this.edges = edges;
    }

    public List<Edge> incidentEdges(Vertex v) {
        return v.edges;
    }

    public List<Vertex> endVertices(Edge e) {
       return e.vertices;
    }

    public Vertex opposite(Vertex v, Edge e) {
        Vertex opposite = null;
        List<Vertex> endVertices = endVertices(e);

        for (int i = 0; i < endVertices.size(); i++) {
            if (endVertices.get(i)!=v)
                opposite = endVertices.get(i);
        }
        return opposite;
    }

    public boolean areAdjacent(Vertex v, Vertex w) {
        List<Edge> myEdges = v.edges;
        for (int i = 0;i<v.edges.size();i++){
            if(myEdges.get(i).vertices.contains(w))
                return true;
        }
        return false;
    }

    //update methods
    public boolean insertVertex(Vertex o) {
        return vertices.add(o);
    }

    public boolean insertEdge(Edge o) {
        return edges.add(o);
    }

    public boolean removeVertx(Vertex v) {
        return vertices.remove(v);
    }

    public boolean removeEdge(Edge v) {
        return edges.remove(v);
    }

    public int numVertix() {
        return vertices.size();
    }

    public int numEdges() {
        return edges.size();
    }

    public List<Vertex> vertices() {
        return vertices;
    }

    public List<Edge> edges() {
        return edges;
    }

    public int degree(Vertex v) {
       return v.edges.size();
    }


}
