package chap07;

public class Student extends People {
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
//		�ڽ� Ŭ������ �����ڿ��� �θ� Ŭ������ �����ڸ� ȣ����
//		�����Ϸ��� �θ�Ŭ������ �⺻ �����ڸ� ȣ���ϴ� super() �� �ڵ����� ������
//		���� Ŭ������ �⺻ �����ڸ� �ۼ��Ͽ� ó���ϰų� �ڽ� Ŭ������ �����ڿ��� �θ�Ŭ������ �����ڸ� ȣ���� �� �ֵ��� �Ű������� �ִ� super(...) �� ȣ���ؾ� ��
		
		super(name,ssn);
		this.studentNo = studentNo;
	}

}
