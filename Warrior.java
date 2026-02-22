public class Warrior extends BaseHero {

        public Warrior(String name, int age, int specialAttribute) {
            super(name, age, specialAttribute, "Warrior");
        }

        public void special(){
            System.out.println(name + " goes into a frenzy and attacks everyone around him using " + specialAttribute + " rage!");
        }

        @Override
        public void attack() {
            System.out.println(name + " attacked with critical damage using a sword!");
        }

        @Override
        public void defended() {
            System.out.println(name + " defended himself with a shield!");
        }
    }
