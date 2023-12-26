
public abstract class GameUnit {
	public AttackBehavior UnitAtk;
	public MovementBehavior UnitMove;
	
	public void attack(){
		UnitAtk.attack(this.getClass().getName());
	}
	public void move() {
		UnitMove.move(this.getClass().getName());
	}
	
	public void setAttackBehavior(AttackBehavior attackBehavior) {
		UnitAtk = attackBehavior;
	}
	public void setMovementBehavior(MovementBehavior moveBehavior) {
		UnitMove = moveBehavior;
	}
}