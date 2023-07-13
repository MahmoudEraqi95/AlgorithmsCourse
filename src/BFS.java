import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) throws InterruptedException {
        Graph g = Main.createGraph();
        bfs(g);
    }

    private static void bfs(Graph g) throws InterruptedException {
        Vertex v = g.vertices.get(0);
        if (v.getLabel()==State.UNEXPLORED){
            BFSComponenet(g, v);
        }
    }

    private static void BFSComponenet(Graph g, Vertex v) throws InterruptedException {
        Queue<Vertex> q = new LinkedList<>();
        v.setLabel(State.EXPLORED);
        q.add(v);
        while (q.size()>0){

            Vertex w = q.poll();
            w.setLabel(State.EXPLORED);
            System.out.println("Ordering: "+w.getKey());
            Thread.sleep(1000);
            for(Edge e: w.edges){
                Vertex v1 = g.opposite(w, e);
                if (v1.getLabel()==State.UNEXPLORED) {
                    q.add(v1);
                    e.label = State.EXPLORED;
                }else
                    e.label = State.BACK;
            }
        }
    }

}
