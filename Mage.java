public class Mage extends BaseHero {
    protected final int specialAttribute;

        public Mage(String name, int age, int specialAttribute) {
            super(name, age, specialAttribute, "Mage");
            this.specialAttribute = specialAttribute;
        }

        public void special(){
            System.out.println(name + " cast a spell using " + specialAttribute + " mana!");
        }

    @Override
    public void attack() {
        System.out.println(name + " attacked with a staff magic!");
    }

    @Override
    public void defended() {
        System.out.println(name + " defended casting a barrier of mana!");
    }
}
