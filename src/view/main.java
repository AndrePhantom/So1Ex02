package view;

import Controller.KillController;

public class main {

		
		KillController procController = new KillController();
	//	String os = procController.os();
	//	System.out.print(os);
		
	//	String process = "C:\\Windows\\write.exe";
	//	procController.callProcess(process);
		
	//	String process = "IPCONFIG";
	//	procController.readProcess(process);
		
		String param = "cmd.exe";
		procController.killProcess(param);
			
		}
			    
	

