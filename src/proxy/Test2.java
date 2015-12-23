package proxy;

public class Test2 {
	/*
	 * AppClassLoader //classpath下能找到的
	 * ExtClassLoader//加载的是jdk/jre/lib/ext/*.jar
	 * 根类加载器（c实现的）----》加载的是jdk/jre/lib/rt.jar--->jdk提供的所有的类
	 * 
	 * 总是先从根类加载器加载如果没有才去扩展类加载器，再没有才去
	 * AppClassLoader
	 */
	public static void main(String[] args) {
		System.out.println("helloworld");
		System.out.println(Test2.class.getClassLoader().getClass().getName());
	    System.out.println(Test2.class.getClassLoader().getParent().getClass().getName());
	   System.out.println(Test2.class.getClassLoader().getParent().getParent());
	    System.out.println(System.class.getClassLoader());
	}

}
