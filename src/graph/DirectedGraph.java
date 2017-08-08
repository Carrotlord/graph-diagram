package graph;

import java.util.List;

/**
 *
 * @author Oliver Chu
 * @param <T>
 */
public interface DirectedGraph<T> {
    public void node(T node);
    public void edge(T origin, T destination);
    public List<T> incoming(T node);
    public List<T> outgoing(T node);
    public List<T> allNodes();
    public List<Edge<T>> allEdges();
}
