package BlockChain_23;

/**
 * @author: Jakub Marciniak
 * #23
 */

class Student {
    String name;
    int grade;

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}

public class ChainMail {
    public static void main(String[] args) {

        String a = "doug dimmamode";
        System.out.println(a.toLowerCase().charAt(0));

        String a1 = "pie";
        int b = a1.concat("  is good").chars().toArray()[0];

        System.out.println(b);

        Student s = new Student();
        s.setGrade(99);
        s.setName("Bob");

        System.out.println(s.getGrade() + ", " + s.getName());

    }
}
