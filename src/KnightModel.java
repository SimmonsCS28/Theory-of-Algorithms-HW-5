import java.util.HashMap;

public class KnightModel {
	
	public int startingPosition;
	public HashMap<Long, Boolean> pathToGoal;
	
	public KnightModel(int startingPosition, HashMap<Long, Boolean> pathToGoal) {
		super();
		this.startingPosition = startingPosition;
		this.pathToGoal = pathToGoal;
	}

	public int getStartingPosition() {
		return startingPosition;
	}

	public void setStartingPosition(int startingPosition) {
		this.startingPosition = startingPosition;
	}

	public HashMap<Long, Boolean> getPathToGoal() {
		return pathToGoal;
	}

	public void setPathToGoal(HashMap<Long, Boolean> pathToGoal) {
		this.pathToGoal = pathToGoal;
	}
}
