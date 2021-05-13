package chap07;

public class AddressBookMain {

	public static void main(String[] args) {
		PhoneBook p1 = new PhoneBook();
		p1.name = "홍길동";
		p1.phoneNum = "010-1234-5678";
		
		p1.outputPhoneNumber();
		
		System.out.println("---------------");
		
		AddressBook ab1 = new AddressBook();
		
		ab1.name = "아이유";
		ab1.email= "iu@naver.com";
		ab1.phoneNum = "010-1234-5678";
		ab1.sns = "인스타";
		
		ab1.AllInfo();

	}

}
