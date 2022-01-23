public class Staff extends Person{

    private int grade; //1=front-line 2=manager 3=vp
    private String staffNumber;
    final String VERSION = "0.0.2";

    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    public Staff(String name) {
        super(name);
    }

    public Staff(String name, String address) {
        super(name, address);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void sayGreetings(){
        System.out.println("You are logged-in to the Intranet, Staff #" + this.staffNumber);
    }

}
