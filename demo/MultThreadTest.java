package demo;

public class MultThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			

			//while (true) {
				MultiThread thread = new MultiThread();
				Thread t = new Thread(thread);
				t.start();
				Thread.sleep(1000);
				MultiThread thread1 = new MultiThread();
				Thread t1 = new Thread(thread1);
				t1.start();
			//}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
