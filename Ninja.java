public class Ninja extends BaseHero{

    public Ninja(String name, int age, int specialAttribute) {
        super(name, age, specialAttribute, "Ninja");
    }

    public void special(){
        System.out.println(name + " become invisible using " + specialAttribute + " energy!");
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks the enemy from behind using shuriken!");
    }

    @Override
    public void defended() {
        System.out.println(name + " defended himself dodging the attack!");
    }
}
