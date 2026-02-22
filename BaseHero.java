public class BaseHero {

    protected String name;
    protected final int age;
    protected int specialAttribute;
    protected final String type;

    protected BaseHero(String name, int age, int specialAttribute, String type){
        this.name = name;
        this.age = age;
        this.specialAttribute = specialAttribute;
        this.type = type;
    }

    public void introduceHero(){
        System.out.println("Hero: " + name);
        System.out.println("Age: " + age);
        System.out.println("Special Attribute: " + specialAttribute);
        System.out.println("Class: " + type);
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(){
        System.out.println(name + " attacked the enemy.");
    }

    public void defended(){
        System.out.println(name + " defended against the enemy attack");
    }
}
