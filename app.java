import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;
public class App{
    public static void main(String[] args){
        Graph graph = new Graph(12);

        //Source
        Vertex vertex0 = new Vertex(0,"Source");

        //Subject
        Vertex CS402 = new Vertex(1,"402");
        Vertex CS403 = new Vertex(2,"403");
        Vertex CS404 = new Vertex(3,"404");
        Vertex CS405 = new Vertex(4,"405");

        //Teacher
        Vertex ns = new Vertex(5,"NS");
        Vertex sv = new Vertex(6,"SV");
        Vertex ap = new Vertex(7,"AP");
        Vertex pb = new Vertex(8,"PB");
        Vertex pj = new Vertex(9,"PJ");
        Vertex as = new Vertex(10,"AS");

        //sink
        Vertex vertext = new Vertex(11,"Sink");


        List<Vertex> vertexList = new ArrayList<>();
        vertexList.add(vertex0);
        vertexList.add(CS402);
        vertexList.add(CS403);
        vertexList.add(CS404);
        vertexList.add(CS405);
        vertexList.add(ns);
        vertexList.add(sv);
        vertexList.add(pb);
        vertexList.add(ap);
        vertexList.add(pj);
        vertexList.add(as);
        vertexList.add(vertext);

        //source to Subject
        graph.addEdge(new Edge(vertex0,CS402,1));
        graph.addEdge(new Edge(vertex0,CS403,1));
        graph.addEdge(new Edge(vertex0,CS404,1));
        graph.addEdge(new Edge(vertex0,CS405,1));

        //Subject to Teacher
        graph.addEdge(new Edge(CS402,ns,1));
        graph.addEdge(new Edge(CS402,as,1));
        graph.addEdge(new Edge(CS402,pj,1));
        
        graph.addEdge(new Edge(CS403,ap,1));
        
        graph.addEdge(new Edge(CS404,sv,1));
        graph.addEdge(new Edge(CS404,as,1));
        graph.addEdge(new Edge(CS405,pb,1));
        graph.addEdge(new Edge(CS405,ns,1));
        graph.addEdge(new Edge(CS405,ap,1));

        

        // Teacher to Sink
        graph.addEdge(new Edge(ns,vertext,1));
        graph.addEdge(new Edge(ap,vertext,1));
        graph.addEdge(new Edge(sv,vertext,1));
        graph.addEdge(new Edge(as,vertext,1));
        graph.addEdge(new Edge(pb,vertext,1));
        graph.addEdge(new Edge(pj,vertext,1));

        System.out.println(graph.getNumberofEdges()+" "+ graph.getGetNumberofVertices());
        FordFulkerson ffed = new FordFulkerson(graph, vertex0, vertext);

        ffed.runEdmundsKarp();


        System.out.println(ffed.getValueOfMaxflow());

        ffed.printMaxFlowPaths(CS405);
        ffed.printMaxFlowPaths(CS402);
        ffed.printMaxFlowPaths(CS403);
        ffed.printMaxFlowPaths(CS404);

      /*  System.out.println("Incut ");
        for (int i=0; i < vertexList.size();i++) {
            System.out.println(vertexList.get(i));
        }
        System.out.println();
*/
    }
}