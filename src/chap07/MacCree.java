package chap07;

public class MacCree extends Character {
	@Override
	public void move() {
		System.out.println("��ũ���� �̵��մϴ�.");
	}
	
	public void stop() {
		System.out.println("��ũ���� ����ϴ�.");
	}
	
	public void attack() {
		System.out.println("��ũ���� �ǽ�Ű�۷� �����մϴ�.");
	}
	
	public void skill() {
		System.out.println("��ũ���� ����ź ��ų�� ����մϴ�.");
	
	}
	public void ultimate() {
		System.out.println("��ũ���� �ñر� Ȳ���� �����ڸ� ����մϴ�.");
	}

}
