package ch04.graph;

public class UndirectedGraph {

    private int count; // 노드의 개수
    private int[][] vertexMatrix;

    public UndirectedGraph(int count) {
        this.count = count;
        this.vertexMatrix = new int[count][count];
    }

    /**
     * 간선의 정보를 추가
     */
    public void addEdges(int from, int to, int weight) {
        vertexMatrix[from][to] = weight;
        vertexMatrix[to][from] = weight; // DirectedGraph일 경우 분리해서 간선 정보를 추가해야 한다.
    }

    public int[][] getVertexMatrix() {
        return vertexMatrix;
    }
}
