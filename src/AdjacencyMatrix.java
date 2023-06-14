import java.util.Scanner;

class AdjacencyMatrix {
    Scanner sc = new Scanner(System.in);

    private final int vertices;
    private final int edges;
    private final boolean[][] adjMat;

    AdjacencyMatrix(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        adjMat = new boolean[vertices][vertices];
    }

    void setAdjacencyMatrixByAllPossibleEdges() {
        int i, j;
        for(i = 0; i < vertices; i++) {
            for(j = i; j < vertices; j++) {
                if(i == j) {
                    adjMat[i][j] = false;
                } else {
                    System.out.printf("%c -->> %c ?? (y/n)\n",i + 65, j + 65);
                    String input = sc.nextLine();
                    if(input.equals("y")) {
                        adjMat[i][j] = true;
                        adjMat[j][i] = true;
                    } else {
                        adjMat[i][j] = false;
                        adjMat[j][i] = false;
                    }
                }
            }
        }
    }

    void initializeAdjMat() {
        int i, j;
        for(i = 0; i < vertices; i++) {
            for(j = 0; j < vertices; j++) {
                adjMat[i][j] = false;
            }
        }
    }

    void setAdjacencyMatrixByUserGivenEdges() {
        int i;
        initializeAdjMat();

        for(i = 0; i < edges; i++) {
            System.out.println("Edge: " + (i + 1));
            System.out.println("From: ");
            int u = sc.nextLine().charAt(0) - 65;

            System.out.println("To: ");
            int v = sc.nextLine().charAt(0) - 65;

            adjMat[u][v] = true;
            adjMat[v][u] = true;
        }
    }

    void displayAdjacencyMatrix() {
        int i, j;
        System.out.printf(" ");
        for(i = 0; i < vertices; i++) {
            System.out.printf("  %c", i + 65);
        }
        System.out.println();

        for(i = 0; i < vertices; i++) {
            System.out.printf("%c  ", i + 65);
            for(j = 0; j < vertices; j++) {
                if(adjMat[i][j]) {
                    System.out.print("T  ");
                } else {
                    System.out.print("F  ");
                }
            }
            System.out.println();
        }



    }
}
