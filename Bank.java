public class Bank {

	private int number;
	private String type;

	public static void main(String [] args){
		Person peter = new Person("Peter");
		System.out.println("Customer is: " + peter.getName());
		System.out.println("Customer address is: " + peter.getAddress());
		peter.setAddress("US");
		System.out.println("Customer is: " + peter.getName());
		System.out.println("Customer address is: " + peter.getAddress());
		peter.sayGreetings();

		Person paul = new Person("Paul", "SG");
		System.out.println("Customer is: " + paul.getName());
		System.out.println("Customer address is: " + paul.getAddress());
		paul.sayGreetings();


		Account ac0001 = new Account("628-329-3948", false);
		peter.setAccount(ac0001);
		peter.getAccount();
//		peter.printAccountDetail();
		peter.printAccountDetailSecondMethod();

		VIPPerson sl = new VIPPerson("sl", "UofG");
		sl.setGrade("b-class");
		System.out.println("Customer is: " + sl.getName());
		System.out.println("Customer address is: " + sl.getAddress());
		System.out.println("Customer grade is: " + sl.getGrade());
		sl.sayGreetings();

		Person mary = new VIPPerson("mary", "UK");
		System.out.println("Customer is: " + mary.getName());
		System.out.println("Customer address is: " + mary.getAddress());
		mary.sayGreetings();

		Staff kelvin = new Staff("Kelvin", "AMK");
		kelvin.setStaffNumber("F092390");
		System.out.println("Customer is: " + kelvin.getName());
		System.out.println("Customer address is: " + kelvin.getAddress());
		kelvin.sayGreetings();
	}
	
}
