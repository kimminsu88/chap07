package chap07;

// 필드 : 이름, 휴대폰 번호 , 이메일주소, sns
// 메서드 : outputAllInfo, outputEmail, outputSns, outputPhone
public class AddressBook extends PhoneBook{
	String email;
	String sns;
	
	public void outputPhoneNumber() {System.out.println(name + "의 전화번호 : " + phoneNum);}
	
	public void outputEmail() {System.out.println(name + "의 이메일 : " + email);}
	
	public void outputSns() {System.out.println(name + "의 sns : " + sns);}
	
	public void AllInfo() {
		outputPhoneNumber();
		outputEmail();
		outputSns();
	}

}
