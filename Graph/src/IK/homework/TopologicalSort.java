package IK.homework;

/*
 * Topological sort Order - build order https://www.youtube.com/watch?v=ddTC4Zovtbc
 * 
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class TopologicalSort {

  public static class GraphVertex {
    String val;
    List<GraphVertex> neighbors;

    public GraphVertex(String val) {
      super();
      this.val = val;
      this.neighbors = new ArrayList<GraphVertex>();
    }

    @Override
    public String toString() {
      return "GraphVertex [val=" + val + "]";
    }
    
    
  }

  public static class GraphEdge {
    GraphVertex src;
    GraphVertex dest;
    boolean isdirectional;

    public GraphEdge(GraphVertex src, GraphVertex dest, boolean isdirectional) {
      super();
      this.src = src;
      this.dest = dest;
      this.isdirectional = isdirectional;
    }


  }

  public static class Graph {
    List<GraphVertex> vertex;
    List<GraphEdge> edges;



    public Graph() {
      this.vertex = new ArrayList<GraphVertex>();
      this.edges = new ArrayList<GraphEdge>();
    }



    public void addVertex(GraphVertex graphVertex) {
      vertex.add(graphVertex);
    }

    public void addEdge(GraphEdge graphEdge) {
      edges.add(graphEdge);
      graphEdge.src.neighbors.add(graphEdge.dest);
    }

    public List<GraphVertex> getAllVertex() {
      return vertex;
    }

    public List<GraphEdge> getAllEdges() {
      return edges;
    }

  }

  public static void main(String[] args) {
    Graph graph = new Graph();

    GraphVertex vertexA = new GraphVertex("A");
    GraphVertex vertexB = new GraphVertex("B");
    GraphVertex vertexC = new GraphVertex("C");
    GraphVertex vertexD = new GraphVertex("D");
    GraphVertex vertexE = new GraphVertex("E");
    GraphVertex vertexF = new GraphVertex("F");
    GraphVertex vertexG = new GraphVertex("G");


    graph.addVertex(vertexA);
    graph.addVertex(vertexB);
    graph.addVertex(vertexC);
    graph.addVertex(vertexD);
    graph.addVertex(vertexE);
    graph.addVertex(vertexF);
    graph.addVertex(vertexG);

    graph.addEdge(new GraphEdge(vertexA, vertexC, true));
    graph.addEdge(new GraphEdge(vertexB, vertexC, true));
    graph.addEdge(new GraphEdge(vertexB, vertexD, true));
    graph.addEdge(new GraphEdge(vertexC, vertexE, true));
    graph.addEdge(new GraphEdge(vertexE, vertexF, true));
    graph.addEdge(new GraphEdge(vertexF, vertexG, true));
    graph.addEdge(new GraphEdge(vertexD, vertexF, true));

    topologicalSort(graph);

  }

  private static void topologicalSort(Graph graph) {
    List<GraphVertex> allVertex = graph.getAllVertex();
    Set<GraphVertex> visited = new HashSet<GraphVertex>();
    Stack<GraphVertex> st = new Stack<GraphVertex>();
    for(GraphVertex v : allVertex) {
      if(!visited.contains(v)) {
        sorthelper(v,st,visited);
      }
    }
    while(!st.isEmpty()) {
      System.out.print(st.pop().val +" ");
    }
    
  }

  private static void sorthelper(GraphVertex v, Stack<GraphVertex> st, Set<GraphVertex> visited) {
    visited.add(v);
    List<GraphVertex> neighbors = v.neighbors;
    for(GraphVertex n : neighbors) {
      if(!visited.contains(n)) {
        sorthelper(n,st,visited);
      }
    }
    st.add(v);
    
  }

}
