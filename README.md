# Subject-Allocation
This repository contains an implementation of a subject allocation algorithm designed to optimize the allocation of subjects to faculties within educational institutions. The algorithm, based on the Edmonds-Karp method, efficiently assigns subjects to faculties while considering factors such as faculty preferences, expertise, and workload balance.

https://ieeexplore.ieee.org/document/10743466

**Description**<br>
The Subject Allocation Algorithm is a Python implementation of the Edmonds-Karp algorithm used to efficiently allocate subjects to faculty members within an educational institution. The algorithm optimizes the allocation process by considering faculty preferences, workload balance, and subject expertise.

**Installation**<br>
to use the Subject Allocation Algorithm, follow these steps:

1. Clone the repository to your local machine.
2. Install Python (version 3.7 or higher) if not already installed.
3. Navigate to the project directory.
4. Run python main.py to execute the algorithm.

**Usage**<br>
The algorithm reads input data from the text file, which contains information about the flow network. The first line of the input file specifies the number of nodes in the network, followed by details about the vertices and edges, including their capacities. The algorithm then defines the source and sink vertices, executes the Edmonds-Karp algorithm to find the maximum flow in the flow network, and prints the total allotment.

**Example**<br>
To demonstrate the algorithm, consider the following scenario with 4 subjects and 2 faculties:

Subjects: Math, Science, English, History
Faculties: Dr. Smith, Prof. Johnson
Both faculties have filled out the subject allotment preference form.

Step 1: Allotment of Vertices
Dr. Smith: Math, Science
Prof. Johnson: English, History
Step 2: Connection of Edges
Dr. Smith prefers Math with a capacity of 3 and Science with a capacity of 2.
Prof. Johnson prefers English with a capacity of 2 and History with a capacity of 1.
Step 3: Allocation Process
The algorithm iterates to find the maximum flow, allocating subjects to faculties based on preferences and capacities.

**Results**<br>
After testing the algorithm with real data from our college's previous years' allotment data, the code successfully executed and provided correct outputs matching the manual allotment technique. The dataset included a total of 15 subjects over a span of 2 semesters from 2 different academic years and involved 26 faculty members from the Computer Science department at Acropolis Institute of Technology and Research.

**Future Enhancements**<br>
1. Implement features for load balancing, priorities, and preference queuing to further optimize the allocation process.
2. Extend the algorithm's application to other domains such as project team job allocation.
