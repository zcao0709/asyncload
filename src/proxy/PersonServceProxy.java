package proxy;

public class PersonServceProxy implements PersonService{
	private PersonService ps;
	@Override
	public void udpate() {
		// TODO Auto-generated method stub
		System.out.println("权限、日志、事务");
		ps.udpate();
		System.out.println("权限、日志、事务...");
	}
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}


}
