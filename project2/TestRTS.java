
public class TestRTS {
	public static void main(String[] args) {
		GameUnit grunt = new Grunt();
		GameUnit tank = new Tank();
		System.out.println("***Standard Grunt***");
		grunt.move();
		grunt.attack();
		System.out.println("***Standard Tank***");
		tank.move();
		tank.attack();
		
		System.out.println("***Upgraded Grunt***");
		grunt.move();
		//give grunt upgraded attack
		grunt.setAttackBehavior(new PistolAttack());
		grunt.attack();
		
		System.out.println("***Upgraded Tank***");
		//give tank upgraded movement
		tank.setMovementBehavior(new FlyingMovement());
		tank.move();
		//give tank upgraded attack
		tank.setAttackBehavior(new RocketAttack());
		tank.attack();
	}
}