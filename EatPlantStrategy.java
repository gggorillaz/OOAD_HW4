public class EatPlantStrategy extends MoveStrategy {

		public void move(Pond pond, Fish fish, double x, double y) {
			double[] location = pond.findNearestPlant(x, y);
			fish.swimTowards(location[0], location[1]);
		}

}