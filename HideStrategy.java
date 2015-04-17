public class HideStrategy extends MoveStrategy {

	public void move(Pond pond, Fish fish, double x, double y) {
		fish.hide();
	}
}