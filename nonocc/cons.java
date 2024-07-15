public class Person {
    private String name;
    private int age;

    public Person withDescription(String desc) {
        this.description = desc;
        return this;
    }

    public String getDescription() {
        return description;
    }
}
