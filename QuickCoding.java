//우리가 일반적으로 말하는 stack는 main()메서드를 수행하기 위한 영역이다.
//스레드를 생성할때마다 JVM에 의해 별도의 stack영역이 할당 된다.
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
		//thread를 수행하기 위한 메모리 공간을 확보하고
		//해당 thread를 Runnable한 상태로 만들어준다
		//run()호출
	}

}
