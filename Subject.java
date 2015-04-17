import java.util.ArrayList;
import java.util.List;

public class Subject {

	protected List<Observer> observers;

	public Subject() {
		observers = new ArrayList<Observer>();
	}

	public void addObserver(Observer obs) {
		observers.add(obs);
	}

	public void notifyObserver(double[] params) {
		for (Observer obs : observers)
			obs.update(params);
	}
}