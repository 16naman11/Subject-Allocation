import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.List;
public class App
{
  public static void main (String[]args)
  {
	Graph graph = new Graph (44);

	//Source
	Vertex vertex0 = new Vertex (0, "Source");

	//Subject
	Vertex CS402 = new Vertex (1, "CS402 Analysis and Design of Algorithms");
	Vertex CS403 = new Vertex (2, "CS403 Software Engg");
	Vertex CS404 = new Vertex (3, "CS404 Computer Architecture and Organization");
	Vertex CS405 = new Vertex (4, "CS405 Operating Systems");
	Vertex CS406A = new Vertex (5, "CS406A Java lab");
	Vertex CS406B = new Vertex (6, "CS406B Python lab ");

	Vertex CS601 = new Vertex (7, "CS601 Machine Learning");
	Vertex CS602 = new Vertex (8, "CS602 Computer Networks");
	Vertex CS603A = new Vertex (9, "CS603A Advance Computer Architecture");
	Vertex CS603B = new Vertex (10, "CS603B Computer Graphics");
	Vertex CS603C = new Vertex (11, "CS603C Compiler Design");
	Vertex CS604A = new Vertex (12, "CS604A Knowledge Management");
	Vertex CS604B = new Vertex (13, "CS604B Project Management");
	Vertex CS605 = new Vertex (14, "CS605 Data Analytics Lab");
	Vertex CS606 = new Vertex (15, "CS606 Skill Development Lab");

	//Teacher
	Vertex ns = new Vertex (16, "NS");
	Vertex sv = new Vertex (17, "SV");
	Vertex ap = new Vertex (18, "AP");
	Vertex pb = new Vertex (19, "PB");
	Vertex pj = new Vertex (20, "PJ");
	Vertex as = new Vertex (21, "AS");
	Vertex am = new Vertex (22, "AM");
	Vertex nps = new Vertex (23, "NPS");
	Vertex rs = new Vertex (24, "RS");
	Vertex aa = new Vertex (25, "AA");
	Vertex bb = new Vertex (26, "BB");
	Vertex sr = new Vertex (27, "SR");
	Vertex sk = new Vertex (28, "SK");
	Vertex aq = new Vertex (29, "AQ");
	Vertex ad = new Vertex (30, "AD");
	Vertex gc = new Vertex (31, "GC");
	Vertex js = new Vertex (32, "JS");
	Vertex ks = new Vertex (33, "KS");
	Vertex lc = new Vertex (34, "LC");
	Vertex pc = new Vertex (35, "PC");
	Vertex rb = new Vertex (36, "RB");
	Vertex rj = new Vertex (37, "RJ");
	Vertex ss = new Vertex (38, "SS");
	Vertex us = new Vertex (39, "US");
	Vertex yp = new Vertex (40, "YP");
	Vertex rc = new Vertex (41, "RC");
	Vertex sj = new Vertex (42, "SJ");

	//sink
	Vertex vertext = new Vertex (43, "Sink");


	  List <Vertex> vertexList = new ArrayList <> ();
	  vertexList.add (vertex0);
	  vertexList.add (CS402);
	  vertexList.add (CS403);
	  vertexList.add (CS404);
	  vertexList.add (CS405);
	  vertexList.add (CS406A);
	  vertexList.add (CS406B);
	  vertexList.add (CS601);
	  vertexList.add (CS602);
	  vertexList.add (CS603A);
	  vertexList.add (CS603B);
	  vertexList.add (CS603C);
	  vertexList.add (CS604A);
	  vertexList.add (CS605);
	  vertexList.add (CS606);


	  vertexList.add (ns);
	  vertexList.add (sv);
	  vertexList.add (pb);
	  vertexList.add (ap);
	  vertexList.add (pj);
	  vertexList.add (as);
	  vertexList.add (am);
	  vertexList.add (nps);
	  vertexList.add (rs);
	  vertexList.add (aa);
	  vertexList.add (bb);
	  vertexList.add (sr);
	  vertexList.add (sk);
	  vertexList.add (aq);
	  vertexList.add (ad);
	  vertexList.add (gc);
	  vertexList.add (js);
	  vertexList.add (ks);
	  vertexList.add (lc);
	  vertexList.add (pc);
	  vertexList.add (rb);
	  vertexList.add (rj);
	  vertexList.add (ss);
	  vertexList.add (us);
	  vertexList.add (yp);
	  vertexList.add (rc);
	  vertexList.add (sj);

	  vertexList.add (vertext);

	//source to Subject
	  graph.addEdge (new Edge (vertex0, CS402, 5));
	  graph.addEdge (new Edge (vertex0, CS403, 5));
	  graph.addEdge (new Edge (vertex0, CS404, 5));
	  graph.addEdge (new Edge (vertex0, CS405, 5));
	  graph.addEdge (new Edge (vertex0, CS601, 5));
	  graph.addEdge (new Edge (vertex0, CS602, 5));
	  graph.addEdge (new Edge (vertex0, CS603B, 3));
	  graph.addEdge (new Edge (vertex0, CS603C, 1));
	  graph.addEdge (new Edge (vertex0, CS604B, 5));


	//Subject to Teacher
	  graph.addEdge (new Edge (CS405, am, 1));
	  graph.addEdge (new Edge (CS403, am, 1));
	  graph.addEdge (new Edge (CS603B, am, 1));
	  graph.addEdge (new Edge (CS601, am, 1));

	  graph.addEdge (new Edge (CS405, aa, 1));
	  graph.addEdge (new Edge (CS403, aa, 1));
	  graph.addEdge (new Edge (CS604B, aa, 1));
	  graph.addEdge (new Edge (CS602, aa, 1));

	  graph.addEdge (new Edge (CS602, nps, 1));
	  graph.addEdge (new Edge (CS405, nps, 1));
	  graph.addEdge (new Edge (CS403, nps, 1));
	  graph.addEdge (new Edge (CS604B, nps, 1));
	  

	  graph.addEdge (new Edge (CS405, pb, 1));
	  graph.addEdge (new Edge (CS402, pb, 1));
	  graph.addEdge (new Edge (CS603B, pb, 1));
	  graph.addEdge (new Edge (CS602, pb, 1));

	  graph.addEdge (new Edge (CS403, pj, 1));
	  graph.addEdge (new Edge (CS402, pj, 1));
	  graph.addEdge (new Edge (CS604B, pj, 1));
	  graph.addEdge (new Edge (CS602, pj, 1));

	  graph.addEdge (new Edge (CS405, rs, 1));
	  graph.addEdge (new Edge (CS404, rs, 1));
	  graph.addEdge (new Edge (CS603A, rs, 1));
	  graph.addEdge (new Edge (CS602, rs, 1));

	  graph.addEdge (new Edge (CS405, sv, 1));
	  graph.addEdge (new Edge (CS404, sv, 1));
	  graph.addEdge (new Edge (CS603A, sv, 1));
	  graph.addEdge (new Edge (CS603C, sv, 1));

	  graph.addEdge (new Edge (CS405, bb, 1));
	  graph.addEdge (new Edge (CS403, bb, 1));
	  graph.addEdge (new Edge (CS604A, bb, 1));
	  graph.addEdge (new Edge (CS604B, bb, 1));
	  
	  graph.addEdge(new Edge(CS603B,sr,1));
	  graph.addEdge(new Edge(CS402,sr,1));
	  graph.addEdge(new Edge(CS403,sr,1));
	  graph.addEdge(new Edge(CS603C,sr,1));
	  
	  graph.addEdge(new Edge(CS604B,sk,1));
      graph.addEdge(new Edge(CS603C,sk,1));
      graph.addEdge(new Edge(CS403,sk,1));
      graph.addEdge(new Edge(CS405,sk,1));
      
      graph.addEdge(new Edge(CS404,aq,1));
      graph.addEdge(new Edge(CS403,aq,1));
      graph.addEdge(new Edge(CS602,aq,1));
      graph.addEdge(new Edge(CS603A,aq,1));
      
      graph.addEdge(new Edge(CS405,ad,1));
      graph.addEdge(new Edge(CS403,ad,1));
      graph.addEdge(new Edge(CS602,ad,1));
      graph.addEdge(new Edge(CS604B,ad,1));
      
      graph.addEdge(new Edge(CS402,as,1));
      graph.addEdge(new Edge(CS403,as,1));
      graph.addEdge(new Edge(CS601,as,1));
      graph.addEdge(new Edge(CS603C,as,1));
      
      graph.addEdge(new Edge(CS403,ap,2));
      graph.addEdge(new Edge(CS604A,ap,1));
      graph.addEdge(new Edge(CS604B,ap,1));
      
      graph.addEdge(new Edge(CS402,gc,1));
      graph.addEdge(new Edge(CS405,gc,1));
      graph.addEdge(new Edge(CS601,gc,1));
      graph.addEdge(new Edge(CS603B,gc,1));
      
      graph.addEdge(new Edge(CS405,js,1));
      graph.addEdge(new Edge(CS403,js,1));
      graph.addEdge(new Edge(CS602,js,1));
      graph.addEdge(new Edge(CS604B,js,1));
      
      graph.addEdge(new Edge(CS402,ks,1));
      graph.addEdge(new Edge(CS405,ks,1));
      graph.addEdge(new Edge(CS601,ks,1));
      graph.addEdge(new Edge(CS603B,ks,1));
      
	  graph.addEdge(new Edge(CS402,lc,1));
      graph.addEdge(new Edge(CS405,lc,1));
      graph.addEdge(new Edge(CS604B,lc,2));
	  
	  graph.addEdge(new Edge(CS402,ns,1));
      graph.addEdge(new Edge(CS405,ns,1));
      graph.addEdge(new Edge(CS601,ns,1));
      graph.addEdge(new Edge(CS604A,ns,1));
      
      graph.addEdge(new Edge(CS405,pc,1));
      graph.addEdge(new Edge(CS403,pc,1));
      graph.addEdge(new Edge(CS602,pc,1));
      graph.addEdge(new Edge(CS604B,pc,1));
      
      graph.addEdge(new Edge(CS404,rb,1));
      graph.addEdge(new Edge(CS403,rb,1));
      graph.addEdge(new Edge(CS602,rb,1));
      graph.addEdge(new Edge(CS603A,rb,1));
      
      graph.addEdge(new Edge(CS405,rj,1));
      graph.addEdge(new Edge(CS403,rj,1));
      graph.addEdge(new Edge(CS602,rj,1));
      graph.addEdge(new Edge(CS601,rj,1));
      
      graph.addEdge(new Edge(CS402,ss,1));
      graph.addEdge(new Edge(CS403,ss,1));
      graph.addEdge(new Edge(CS602,ss,1));
      graph.addEdge(new Edge(CS604B,ss,1));
      
      graph.addEdge(new Edge(CS404,us,1));
      graph.addEdge(new Edge(CS405,us,1));
      graph.addEdge(new Edge(CS604B,us,2));


	// Teacher to Sink
	  graph.addEdge (new Edge (ns, vertext, 2));
	  graph.addEdge (new Edge (ap, vertext, 2));
	  graph.addEdge (new Edge (sv, vertext, 2));
	  graph.addEdge (new Edge (as, vertext, 2));
	  graph.addEdge (new Edge (pb, vertext, 2));
	  graph.addEdge (new Edge (pj, vertext, 2));
	  graph.addEdge (new Edge (am, vertext, 2));
	  graph.addEdge (new Edge (aa, vertext, 2));
	  graph.addEdge (new Edge (bb, vertext, 2));
	  graph.addEdge (new Edge (nps, vertext, 2));
	  graph.addEdge (new Edge (rs, vertext, 2));
	  graph.addEdge (new Edge (sr, vertext, 2));
	  graph.addEdge (new Edge (sk, vertext, 2));
	  graph.addEdge (new Edge (ad, vertext, 2));
	  graph.addEdge (new Edge (aq, vertext, 2));
	  graph.addEdge (new Edge (gc, vertext, 2));
	  graph.addEdge (new Edge (js, vertext, 2));
	  graph.addEdge (new Edge (ks, vertext, 2));
	  graph.addEdge (new Edge (lc, vertext, 2));
	  graph.addEdge (new Edge (pc, vertext, 2));
	  graph.addEdge (new Edge (rb, vertext, 2));
	  graph.addEdge (new Edge (rj, vertext, 2));
	  graph.addEdge (new Edge (ss, vertext, 2));
	  graph.addEdge (new Edge (us, vertext, 2));


	  System.out.println (graph.getNumberofEdges () + " " +
						  graph.getGetNumberofVertices ());
	FordFulkerson ffed = new FordFulkerson (graph, vertex0, vertext);

	  ffed.runEdmundsKarp ();


	  System.out.println (ffed.getValueOfMaxflow ());

	  ffed.printMaxFlowPaths (CS601);
	  ffed.printMaxFlowPaths (CS602);
	  ffed.printMaxFlowPaths (CS603B);
	  ffed.printMaxFlowPaths (CS603C);
	  ffed.printMaxFlowPaths (CS604B);
	  
	  ffed.printMaxFlowPaths (CS402);
	  ffed.printMaxFlowPaths (CS403);
	  ffed.printMaxFlowPaths (CS404);
	  ffed.printMaxFlowPaths (CS405);
	  
	  
	  

	/*  System.out.println("Incut ");
	   for (int i=0; i < vertexList.size();i++) {
	   System.out.println(vertexList.get(i));
	   }
	   System.out.println();
	 */
  }
}
