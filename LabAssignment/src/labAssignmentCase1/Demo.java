package labAssignmentCase1;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			Subj subject = new CObject(new ArrayList<Observer>(), "Soccer Match [2020jun01]");
	        Observer observer1 = new SMS(subject, "mohsin [Bhakkar]");
	        observer1.subscribe();
	        System.out.println();
	        Observer observer2 = new SMS(subject, "Dawar [Abbattabad]");
	        observer2.subscribe();
	        Commentary cObject = ((Commentary) subject);
	        cObject.setDesc("Welcome to live match");
	        cObject.setDesc("Score 0-0");
	        System.out.println();
	        observer2.unSubscribe();
	        System.out.println();
	        cObject.setDesc("Lahore posted a goal");
	        cObject.setDesc("Score 1-0");
	        System.out.println();
	        //Observer observer3 = new SMS(subject, "Usman [BhawalPur]");
	        ///observer3.subscribe();
	        //System.out.println();
	        cObject.setDesc("another  goal posted by lahore");
	        cObject.setDesc("Half time Score 2-0");
	}

}
