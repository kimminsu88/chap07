package chap07;

public class AddressBookMain {

	public static void main(String[] args) {
		PhoneBook p1 = new PhoneBook();
		p1.name = "ȫ�浿";
		p1.phoneNum = "010-1234-5678";
		
		p1.outputPhoneNumber();
		
		System.out.println("---------------");
		
		AddressBook ab1 = new AddressBook();
		
		ab1.name = "������";
		ab1.email= "iu@naver.com";
		ab1.phoneNum = "010-1234-5678";
		ab1.sns = "�ν�Ÿ";
		
		ab1.AllInfo();

	}

}
