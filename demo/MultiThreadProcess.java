package demo;

import java.util.ArrayList;
import java.util.List;

public class MultiThreadProcess {

	private static final MultiThreadProcess proc = new MultiThreadProcess();
	
	private   List<String> methodName= new ArrayList<String>(); //static/non-static
 	
	private MultiThreadProcess(){
		
	}
	public static MultiThreadProcess getInstance(){
		return proc;
	}
	
	private MultithreadVO vo;
	public MultithreadVO getName1() throws InterruptedException{
		methodName.add("getName1");
		 vo= new MultithreadVO();
		 Thread.sleep(10);
		 vo.setName("getName1");
		 Thread.sleep(20);
		 
		 return vo;
	}
	
	public MultithreadVO getName2() throws InterruptedException{
		methodName.add("getName2");
		 vo= new MultithreadVO();
		 Thread.sleep(5);
		 vo.setName("getName2");
		 Thread.sleep(50);
		 
		 return vo;
	}
	
	
}
