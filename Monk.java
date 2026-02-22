public class Monk extends BaseHero {

    public Monk(String name, int age, int specialAttribute) {
        super(name, age, specialAttribute, "Monk");
    }

    public void specialPower() {
        System.out.println(name + " used a technique using " + specialAttribute + " Qi!");
    }

    @Override
    public void attack() {
        System.out.println(name + " attacked with lightning speed using his spiritual energy!");
    }

    @Override
    public void defended() {
        System.out.println(name + " strengthened his body with Qi to block the attack!");
    }
}