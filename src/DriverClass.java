import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vertices;
        int edges;

        System.out.println("Enter number of vertices: ");
        vertices = Integer.parseInt(sc.nextLine());

        System.out.println("Enter number of edges: ");
        edges = Integer.parseInt(sc.nextLine());

        AdjacencyMatrix am = new AdjacencyMatrix(vertices, edges);

        System.out.println("By All Possible Edges: ");
        am.displayAdjacencyMatrix();
        am.setAdjacencyMatrixByAllPossibleEdges();
        am.displayAdjacencyMatrix();
        System.out.println();
        System.out.println("By User Given Edges: ");
        am.setAdjacencyMatrixByUserGivenEdges();
        am.displayAdjacencyMatrix();

    }
}
