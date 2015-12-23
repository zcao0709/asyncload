package proxy;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonService ps = new PersonServiceImpl();
		
	    PersonService psProxy = (PersonService)ProxyFactory.getProxy(ps);
	    psProxy.udpate();
	    psProxy.insert();
	}

}
