package labAssignmentCase2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SStorage store = new SStorage();
		store.addShape("Square");
		store.addShape("Circle");
		store.addShape("Rectangle");
		SIterator iterate = new SIterator(store.getShapes());
		while(iterate.hasNext()){
			System.out.println(iterate.next());
		}
		System.out.println("removing while iterating,,,,,,");
		iterate = new SIterator(store.getShapes());
		while(iterate.hasNext()){
			System.out.println(iterate.next());
			iterate.remove();
		}
	}

}
