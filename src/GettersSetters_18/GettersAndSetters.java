package GettersSetters_18;

/**
 * @author: Jakub Marciniak
 * #18
 */

public class GettersAndSetters {

    String name;
    int age;

    public static void main(String[] args) {

        GettersAndSetters a = new GettersAndSetters();
        saySomething("Jackob");

        //Don't do that
        a.age =56;
        a.name = "Ramirez";

        System.out.println(a.age + " years: " + a.name);

        a.printDetails();

        a.setName("Pablo");
        a.setAge(62);

        System.out.println(a.getAge());
        System.out.println(a.getName());

        a.printDetails2();



    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

public void printDetails2 (){
        System.out.println(getName() +", "+getAge());
}

    public void printDetails(){
        System.out.println(age + " years: " + name);
    }

    public static void saySomething(String sth){
        System.out.println("Hi, it's me saySomething: " + sth);
    }

}
