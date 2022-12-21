
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	BaseLogger[] loggers=new BaseLogger[] {new FilesLogger(),new ConcoloLogger(), new DatabaseLogger(), new EmailLogger()
		
		};
	for(BaseLogger logger:loggers) {
	
		
		
		
		
		logger.Log("Log mesajý");
		}
		
	}

}
