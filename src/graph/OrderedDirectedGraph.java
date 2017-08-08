package graph;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oliver Chu
 * @param <T>
 */
public class OrderedDirectedGraph<T> implements DirectedGraph<T> {
    private final ArrayList<T> nodes = new ArrayList<>();
    private final ArrayList<Edge<T>> edges = new ArrayList<>();

    @Override
    public void node(T node) {
        if (!nodes.contains(node)) {
            nodes.add(node);
        }
    }

    @Override
    public void edge(T origin, T destination) {
        node(origin);
        node(destination);
        Edge<T> edge = new Edge<>(origin, destination);
        if (!edges.contains(edge)) {
            edges.add(edge);
        }
    }

    @Override
    public List<T> incoming(T node) {
        ArrayList<T> results = new ArrayList<>();
        for (Edge<T> edge : edges) {
            if (edge.getDestination().equals(node)) {
                results.add(edge.getOrigin());
            }
        }
        return results;
    }

    @Override
    public List<T> outgoing(Object node) {
        ArrayList<T> results = new ArrayList<>();
        for (Edge<T> edge : edges) {
            if (edge.getOrigin().equals(node)) {
                results.add(edge.getDestination());
            }
        }
        return results;
    }

    @Override
    public List<T> allNodes() {
        return nodes;
    }

    @Override
    public List<Edge<T>> allEdges() {
        return edges;
    }
    
}
