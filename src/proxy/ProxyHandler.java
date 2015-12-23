package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//Jdk动态代理的代理生成器
public class ProxyHandler implements InvocationHandler{
	private Object target;//目标对象
	public ProxyHandler(Object target){
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("方法前权限、事务、日志");
		method.invoke(target, args);
		System.out.println("方法后的日志事务");
		return null;
	}

}
