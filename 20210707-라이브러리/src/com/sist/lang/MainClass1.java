package com.sist.lang;
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class MainClass1 {

	public static void main(String[] args) {
		/*
		String data="���� ���� �����е鲲���� �����Ͻðڽ��ϴٸ��� �ֱ�"
				+ " ���� ������ �߻��ϰ� �ִ� ���̹��̷����� ���԰� "
				+ "Ȯ�� �׸��� �������ڵ�, Ư�� �������� �߽����� �̷� �е��� "
				+ "Ȱ������ �����ϸ鼭 ������ ���� ���� "
				+ "��Ȳ�̶�� �����˴ϴٸ��� ���� �����е鲲 �ٽ� �� �� ������� "
				+ "���ĵ帱 ���ۿ� ���� ��Ȳ�� ���ؼ� ����帳�ϴ�.";
		// matches => ���Խ� => �̸���, IP, ��ȭ��ȣ ....
		// �⺻���� - data.matches(" .*  �Է°� .*  ")
		if(data.matches(".*������.*")){
			System.out.println("���ԵǾ� �ֽ��ϴ�");
		}
		else {
			System.out.println("�����ԵǾ� �ֽ��ϴ�");
		}
		// ����� ���� data.matches(".*[a-zA-Z].*")
		// ���� ���� data.matches(".*[0-9].*")
		// �ѱ� ���� data.matches(".*[��-�R].*")
		 */
		
		String data="ABCDEFGHIJKLMN";
		for(int i=0; i<data.length();i++) {
			System.out.print(data.charAt(i));
		}
		System.out.println();
		for(int i=data.length()-1; i>0;i--) {
			System.out.print(data.charAt(i));
		}
		System.out.println();
		// reverse�� ����ص� �Ȱ��� ������ ����� ���� �� �ִ�
		StringBuffer sb=new StringBuffer(data); // �׸��� ����
		System.out.println(sb.toString());
		String s=sb.reverse().toString();
		System.out.println(s);
	}

}
