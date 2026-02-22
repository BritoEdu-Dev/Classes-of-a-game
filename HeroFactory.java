public class HeroFactory {
    public static BaseHero createHero(String name, int age, int specialAttribute, String type) {
        String typeLower = type.toLowerCase();

        return switch (typeLower) {
            case "mage"    -> new Mage(name, age, specialAttribute);
            case "warrior" -> new Warrior(name, age, specialAttribute);
            case "ninja"   -> new Ninja(name, age, specialAttribute);
            case "monk"    -> new Monk(name, age, specialAttribute);
            case "doctor"  -> new Doctor(name, age, specialAttribute);
            default        -> new BaseHero(name, age, specialAttribute, "Adventurer");
        };
    }
}