
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Graph graph = createGraph();
        for (int i = 0; i < graph.vertices.size(); i++) {
            System.out.print(graph.vertices.get(i).getKey()+"----->");
            for (int j = 0;j<graph.vertices.get(i).edges.size();j++){
                System.out.print("("+graph.vertices.get(i).edges.get(j).vertices.get(0).getKey()+",");
                System.out.print(graph.vertices.get(i).edges.get(j).vertices.get(1).getKey()+")");
            }
            System.out.println();
        }

    }
    public static Graph createGraph(){

        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);
        Vertex vertex5 = new Vertex(5);
        Vertex vertex6 = new Vertex(6);


        Edge edge12 = new Edge(List.of(vertex1, vertex2));
        Edge edge13 = new Edge(List.of(vertex1, vertex3));
        Edge edge23 = new Edge(List.of(vertex2, vertex3));
        Edge edge24= new Edge(List.of(vertex2, vertex4));
        Edge edge25= new Edge(List.of(vertex2, vertex5));
        Edge edge46= new Edge(List.of(vertex4, vertex6));

        Graph graph = new Graph();
        graph.insertVertex(vertex1);
        graph.insertVertex(vertex2);
        graph.insertVertex(vertex3);
        graph.insertVertex(vertex4);
        graph.insertVertex(vertex5);
        graph.insertVertex(vertex6);
        graph.insertEdge(edge12);
        graph.insertEdge(edge23);
        graph.insertEdge(edge24);
        graph.insertEdge(edge25);
        graph.insertEdge(edge13);
        graph.insertEdge(edge46);
        graph.removeEdge(edge12);
        return graph;
    }
}