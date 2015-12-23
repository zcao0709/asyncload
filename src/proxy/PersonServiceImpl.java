package proxy;

public class PersonServiceImpl implements PersonService{

	@Override
	public void udpate() {
		//权限、日志、事务等处理
		System.out.println("udpate...");
		//日志、事务
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("insert...");
	}


}
