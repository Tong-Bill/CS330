
public class Grunt extends GameUnit {
	public Grunt(){
		System.out.println("new Grunt");
		UnitAtk = new AxeAttack();
		UnitMove = new WalkingMovement();
	}
}
