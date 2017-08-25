package demo;

public class MultiThread implements Runnable{

	//private static MultiThreadProcess proc = new MultiThreadProcess();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Calling getName1");
		try {
			MultiThreadProcess proc = MultiThreadProcess.getInstance();
			MultithreadVO mvo =proc.getName1();
			
			while (true){
			 mvo = proc.getName1();
		    Thread.sleep(200);
			System.out.println(mvo.getName());
			if(!"getName1".equals(mvo.getName())){
				System.out.println("****************** Race cond in getName1" + mvo.getName());
			}
			
			 mvo = proc.getName2();
			 Thread.sleep(300);
			System.out.println(mvo.getName());
			if(!"getName2".equals(mvo.getName())){
				System.out.println("****************** Race cond in getName2" + mvo.getName());
			}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Calling getName2");
		
	}

	
	
}
