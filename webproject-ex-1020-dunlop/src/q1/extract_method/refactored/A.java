package q1.extract_method.refactored;

import java.util.List;

public class A{
   Node m1(List<Node> nodes, String p) {
      extractedMethod(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	   extractedMethod(edgeList, p);
	   return null;
   }

   <T extends Generic> void extractedMethod (List<T> list, String p){
	   for (Generic item : list) {
		   if ((item).contains(p))
				System.out.println(item);
	   }
   }
}

class Generic {
	String name;

	public boolean contains(String p) {
		return name.contains(p);
	}
}

class Node extends Generic {
}

class Edge extends Generic {
}
