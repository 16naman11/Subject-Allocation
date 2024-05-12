class Graph:
    def __init__(self, size):
        self.adj_matrix = [[0] * size for _ in range(size)]
        self.size = size
        self.vertex_data = [''] * size

    def add_edge(self, u, v, c):
        self.adj_matrix[u][v] = c

    def add_vertex_data(self, vertex, data):
        if 0 <= vertex < self.size:
            self.vertex_data[vertex] = data
            
    def getn(self):
        return self.size
    
    def bfs(self, s, t, parent):
        visited = [False] * self.size
        queue = []  # Using list as a queue
        queue.append(s)
        visited[s] = True

        while queue:
            u = queue.pop(0)  # Pop from the start of the list

            for ind, val in enumerate(self.adj_matrix[u]):
                if not visited[ind] and val > 0:
                    queue.append(ind)
                    visited[ind] = True
                    parent[ind] = u

        return visited[t]
    
    def edmonds_karp(self, source, sink):
        parent = [-1] * self.size
        max_flow = 0

        while self.bfs(source, sink, parent):#true if path found false otherwise
            path_flow = float("Inf")
            s = sink
            while(s != source):# get bottleneck value
                path_flow = min(path_flow, self.adj_matrix[parent[s]][s])
                s = parent[s]

            max_flow += path_flow # add to maxflow
            v = sink
            while(v != source): #update capacity values of edges in adjacency matrix
                u = parent[v]
                self.adj_matrix[u][v] -= path_flow
                self.adj_matrix[v][u] += path_flow
                v = parent[v]

            path = []
            v = sink
            while(v != source):# generates path
                path.append(v)
                v = parent[v]
            path.append(source)
            path.reverse()
            path_names = [self.vertex_data[node] for node in path]
            print("Allotment:", " -> ".join(path_names[1:-1]))
        return max_flow

def getdata(fname):
    f = open(fname,'r')
    data = f.readlines()
    nnodes = int(data[0])
    V = data[1].split(' ')
    V.insert(0,'s')
    V.append('t')
    E = data[2:]
    g = Graph(nnodes)
    for i, name in enumerate(V):
        g.add_vertex_data(i, name)
        
    for e in E:
        u,v,c = map(int, e.strip().split(' '))
        g.add_edge(u, v, c) 
    
    return g

g = getdata('input.txt')    
source = 0; sink = g.getn() - 1
print("Total allotment is %d " % g.edmonds_karp(source, sink))

