import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of subjects (n) and faculties (n2)
        System.out.print("Enter the number of subjects: ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of faculties: ");
        int n2 = scanner.nextInt();

        // Creating a graph with n + n2 + 2 vertices (including source and sink)
        Graph graph = new Graph(n + n2 + 2);

        // Creating vertices for source, sink, subjects, and faculties
        Vertex source = new Vertex(0, "Source");
        Vertex sink = new Vertex(n + n2 + 1, "Sink");

        // Adding subjects
        List<Vertex> subjectVertices = new ArrayList<>();
        System.out.println("Enter names of subjects:");
        for (int i = 1; i <= n; i++) {
            System.out.print("Subject " + i + ": ");
            String subjectName = scanner.next();
            Vertex subject = new Vertex(i, subjectName);
            subjectVertices.add(subject);
            graph.addEdge(new Edge(source, subject, 1)); // Adding edges from source to subjects
        }

        // Adding faculties
        List<Vertex> facultyVertices = new ArrayList<>();
        System.out.println("Enter names of faculties:");
        for (int i = 1; i <= n2; i++) {
            System.out.print("Faculty " + i + ": ");
            String facultyName = scanner.next();
            Vertex faculty = new Vertex(n + i, facultyName);
            facultyVertices.add(faculty);
            graph.addEdge(new Edge(faculty, sink, (n / n2)+1)); // Adding edges from faculties to sink
        }

        // Asking for preferences
        for (Vertex faculty : facultyVertices) {
            for (Vertex subject : subjectVertices) {
                System.out.print("Does " + faculty.getName() + " prefer " + subject.getName() + "? (yes/no): ");
                String preference = scanner.next();
                if (preference.equalsIgnoreCase("yes")) {
                    graph.addEdge(new Edge(subject, faculty, 1));
                }
            }
            System.out.print("\n\n");
        }

        // Running the Ford-Fulkerson algorithm
        FordFulkerson fordFulkerson = new FordFulkerson(graph, source, sink);
        fordFulkerson.runEdmundsKarp();

        // Printing the maximum flow value
        System.out.println("Maximum Flow Value: " + fordFulkerson.getValueOfMaxflow());

        // Printing the allocation
        System.out.println("Allocation:");
        for (Vertex subject : subjectVertices) {
            fordFulkerson.printMaxFlowPaths(subject);
        }
    }
}
