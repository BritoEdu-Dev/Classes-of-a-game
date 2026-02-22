public class Main {
    public static void main(String[] args){
        BaseHero player1 = HeroFactory.createHero("Eduardo", 21, 165, "mage");
        BaseHero player2 = HeroFactory.createHero("Mel", 48, 180,"warrior");
        BaseHero player3 = HeroFactory.createHero("Felipe", 24, 165, "ninja");
        BaseHero player4 = HeroFactory.createHero("Italo", 19, 165, "monk");
        BaseHero player5 = HeroFactory.createHero("Clarissa", 26, 105, "doctor");

        player1.introduceHero();
        System.out.println("-------------------------");
        player1.attack();
        System.out.println("-------------------------");
        player1.defended();

        System.out.println("-------------------------");
        System.out.println("                         ");
        System.out.println("                         ");
        System.out.println("-------------------------");

        player2.introduceHero();
        System.out.println("-------------------------");
        player2.attack();
        System.out.println("-------------------------");
        player2.defended();

        System.out.println("-------------------------");
        System.out.println("                         ");
        System.out.println("                         ");
        System.out.println("-------------------------");

        player3.introduceHero();
        System.out.println("-------------------------");
        player3.attack();
        System.out.println("-------------------------");
        player3.defended();

        System.out.println("-------------------------");
        System.out.println("                         ");
        System.out.println("                         ");
        System.out.println("-------------------------");

        player4.introduceHero();
        System.out.println("-------------------------");
        player4.attack();
        System.out.println("-------------------------");
        player4.defended();

        System.out.println("-------------------------");
        System.out.println("                         ");
        System.out.println("                         ");
        System.out.println("-------------------------");

        player5.introduceHero();
        System.out.println("-------------------------");
        player5.attack();
        System.out.println("-------------------------");
        player5.defended();
        System.out.println("-------------------------");
    }
}
