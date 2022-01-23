public class VIPPerson extends Person{

    private String grade; //m-class Million, b-class Billion
    final String VERSION = "0.0.1";

    public VIPPerson(String name) {
        super(name);
    }

    public VIPPerson(String name, String address) {
        super(name, address);
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void sayGreetings(){
        System.out.println("Thank you for being our valuable customer, VIP " + super.name);
    }

}
