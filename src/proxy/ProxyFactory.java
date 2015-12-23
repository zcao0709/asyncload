package proxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {
	public static Object getProxy(Object target){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new ProxyHandler(target));
	}
}
