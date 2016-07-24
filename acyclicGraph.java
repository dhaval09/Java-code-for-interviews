package javaapplication21;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Input format:
 * parent child
 * 8 2
 * 2 4
 * 2 3
 * 3 8
 * exit
 * Use "exit" keyword or press extra Enter key to see the results.
 * @author dhaval
 *
 */

public class acyclicGraph {
	static HashMap<Integer,ArrayList<Integer>> Graph;
	static boolean[] seen;  
	boolean flag = false;
	public static void main(String args[]) throws IOException{
		Graph = new HashMap<Integer,ArrayList<Integer>>();
		acyclicGraph aG = new acyclicGraph(); 
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

			String sCurrentLine = br.readLine();

			while ((sCurrentLine != null) && !sCurrentLine.equals("exit") && !sCurrentLine.equals("")) {
				String[] line = sCurrentLine.split("[\\W]+");
				int parent = Integer.parseInt(line[0]);
				int child= Integer.parseInt(line[1]);

				if(Graph.get(parent) == null){
					aG.createNode(parent);
				}
				if(Graph.get(child) == null){
					aG.createNode(child);
				}

				aG.checkCycle(parent,child);
				System.out.println(Graph);
				sCurrentLine = br.readLine();

			}
			aG.printGraph(Graph);
		}
	}

	void createNode(int key){
		Graph.put(key,null);
	}

	void addChild(int parent,int child){
		ArrayList<Integer> values;
		values = Graph.get(parent);
		if(values == null){
			values = new ArrayList<Integer>();
			values.add(child);
			Graph.put(parent,values);
		}
		else{
			values.add(child);
			Graph.put(parent,values);
		}
	}

	void removeChild(int parent, int child){
		Graph.get(parent).remove(new Integer(child));
	}

	boolean checkCycle(int parent,int child){
		seen = new boolean[60001];
		addChild(parent,child);
		boolean DFSResult = DFS(child,Graph);
		if(!DFSResult){
			return true;
		}
		else{
			removeChild(parent, child);
		}
		return false;
	}

	boolean DFS(int child, HashMap<Integer,ArrayList<Integer>> tempGraph){
		flag = false;
		if(seen[child] == true){
			System.out.println("A Cycle exists, please try different input.");
			flag = true;
			return true;
		}

		seen[child] = true;
		ArrayList<Integer> neighbours = getNeighbours(child,tempGraph);
		if(neighbours != null){
			for(int i: neighbours){
				DFS(i,tempGraph);
			}
		}
		return flag;
	}

	ArrayList<Integer> getNeighbours(int child, HashMap<Integer,ArrayList<Integer>> tempGraph){
		return tempGraph.get(child);
	}

	void printGraph(HashMap<Integer,ArrayList<Integer>> Graph){
		Set<Integer> keys = Graph.keySet();
		for(Integer i : keys){
			System.out.print(i+" -> ");
			ArrayList<Integer> values = Graph.get(i);
			if(values != null && !values.isEmpty()){
				for(Integer value: values){
					System.out.print(value+", ");
				}
			}
			else{
				System.out.print("No children");
			}
			System.out.println();
		}
	}
}