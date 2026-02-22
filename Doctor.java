public class Doctor extends BaseHero{

    public Doctor(String name, int age, int specialAttribute) {
        super(name, age, specialAttribute, "Doctor");
    }

    public void specialPower() {
        System.out.println(name + " healing a friend using " + specialAttribute + " intelligence!");
    }

    @Override
    public void attack() {
        System.out.println(name + " attacking using a dagger!");
    }

    @Override
    public void defended() {
        System.out.println(name + " dodging an attack!");
    }
}
