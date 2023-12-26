
public class Tank extends GameUnit {
	public Tank(){
		System.out.println("new Tank");
		UnitAtk = new CannonAttack();
		UnitMove = new DrivingMovement();
	}
}
