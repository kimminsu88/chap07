package chap07;

// �ʵ� : �̸�, �޴��� ��ȣ , �̸����ּ�, sns
// �޼��� : outputAllInfo, outputEmail, outputSns, outputPhone
public class AddressBook extends PhoneBook{
	String email;
	String sns;
	
	public void outputPhoneNumber() {System.out.println(name + "�� ��ȭ��ȣ : " + phoneNum);}
	
	public void outputEmail() {System.out.println(name + "�� �̸��� : " + email);}
	
	public void outputSns() {System.out.println(name + "�� sns : " + sns);}
	
	public void AllInfo() {
		outputPhoneNumber();
		outputEmail();
		outputSns();
	}

}
