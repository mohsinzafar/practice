package labAssignmentCase2;
import java.util.Iterator;
public class SIterator implements Iterator<Shape> {
	private Shape [] shapes;
	int position;
	
	public SIterator(Shape []shapes){
		this.shapes = shapes;
	}
	public boolean hasNext() {
		if(position >= shapes.length || shapes[position] == null)
			return false;
		return true;
	}
	public Shape next() {
		return shapes[position++];
	}
	public void remove() {
		if(position <=0 )
			throw new IllegalStateException("Illegal position");
		if(shapes[position-1] !=null){
			for (int i= position-1; i<(shapes.length-1);i++){
				shapes[i] = shapes[i+1];
			}
			shapes[shapes.length-1] = null;
		}
	}
}
