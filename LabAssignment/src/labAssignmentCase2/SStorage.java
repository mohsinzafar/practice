package labAssignmentCase2;

public class SStorage {
	private Shape []shapes = new Shape[5];
	private int index;
	 void addShape(String name){
		int i = index++;
		shapes[i] = new Shape(i,name);
	}
	public Shape[] getShapes(){
		return shapes;
	}
}
