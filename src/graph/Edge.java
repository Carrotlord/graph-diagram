package graph;

/**
 *
 * @author Oliver Chu
 * @param <T>
 */
public class Edge<T> {
    private final T origin;
    private final T destination;
    
    public Edge(T from, T to) {
        origin = from;
        destination = to;
    }
    
    public T getOrigin() {
        return origin;
    }
    
    public T getDestination() {
        return destination;
    }
    
    public boolean equals(Edge<T> otherEdge) {
        return getOrigin() == otherEdge.getOrigin() &&
               getDestination() == otherEdge.getDestination();
    }
    
    @Override
    public String toString() {
        return "(" + origin + " -> " + destination + ")";
    }
}
