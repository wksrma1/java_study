//�츮�� �Ϲ������� ���ϴ� stack�� main()�޼��带 �����ϱ� ���� �����̴�.
//�����带 �����Ҷ����� JVM�� ���� ������ stack������ �Ҵ� �ȴ�.
public class QuickCoding{
	public static BankAccount account=new BankAccount();
	public static void main (String []args){
		Thread depositMan = new Thread(new Runnable(){
			@Override
			public void run(){
				for(int i=0;i<100;i++){
				account.add(10);
				}
			}
		});
		
		Thread withdrawMan = new Thread(new Runnable(){
			@Override
			public void run(){
				for(int i=0;i<100;i++){
					account.delete(10);
					}
			}
		});
		depositMan.start();
		withdrawMan.start();
		//thread�� �����ϱ� ���� �޸� ������ Ȯ���ϰ�
		//�ش� thread�� Runnable�� ���·� ������ش�
		//run()ȣ��
	}

}
