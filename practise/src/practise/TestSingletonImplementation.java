package practise;

class TestSingletonImplementation {
public static void main(String args[]) {
		
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		SingletonClass obj3 = SingletonClass.getInstance();
		
		obj1.str = (obj1.str).toUpperCase();
		
		System.out.println(obj1.str);
		System.out.println(obj2.str);
		System.out.println(obj3.str);
		
	}

}
