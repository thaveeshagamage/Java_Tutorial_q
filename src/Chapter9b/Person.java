package Chapter9b;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
        System.out.println("Person default constructor called");
    }
    public Person(String name){
            System.out.println("Person 2nd constructor called. Name taken as parameter: " + name);

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    


}
