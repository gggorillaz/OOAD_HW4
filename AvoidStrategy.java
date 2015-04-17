public class AvoidStrategy extends MoveStrategy {

	public void move(Pond pond, Fish fish, double x, double y) {
		double[] location = pond.findNearestBigFish(x, y);
        fish.swimAway(location[0], location[1]);
	}
}