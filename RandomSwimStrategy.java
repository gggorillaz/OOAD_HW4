public class RandomSwimStrategy extends MoveStrategy {

	public void move(Pond pond, Fish fish, double x, double y) {
		fish.swimRandomly();
	}
}