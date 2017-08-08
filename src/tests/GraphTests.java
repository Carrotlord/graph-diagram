package tests;

import graph.OrderedDirectedGraph;

/**
 *
 * @author Oliver Chu
 */
public class GraphTests {
    public static void orderedDirectedGraphTest() {
        OrderedDirectedGraph<String> graph = new OrderedDirectedGraph<>();
        graph.edge("Alice", "Bob");
        graph.edge("Alice", "Carol");
        graph.edge("Carol", "David");
        graph.edge("Bob", "David");
        graph.edge("Eve", "Mallory");
        graph.node("Frank");
        System.out.println(graph.allNodes());
        System.out.println(graph.allEdges());
        System.out.println(graph.incoming("Bob"));
        System.out.println(graph.outgoing("Bob"));
        System.out.println(graph.outgoing("Alice"));
    }
}
