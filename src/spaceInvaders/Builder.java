package spaceInvaders;

public class Builder {
	
	private ShotEntity shot;
	
	public Builder(Game game, String sprite, int x, int y) {
		shot = new ShotEntity(game, sprite, x, y);
	}
	
	public void builddy() {
		shot.dy = -300;
	}
	
	ShotEntity returnShot() {
		return shot;
	}
}
