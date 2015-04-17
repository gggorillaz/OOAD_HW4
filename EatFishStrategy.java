public class EatFishStrategy extends MoveStrategy {

	public void move(Pond pond, Fish fish, double x, double y) {
		double[] location = pond.findNearestSmallFish(x, y);
        fish.swimTowards(location[0], location[1]);
	}
}