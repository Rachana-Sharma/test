package practise;

//Singleton class example
class SingletonClass {
	
	private static SingletonClass s = null;
	
	public String str;
	
	private SingletonClass() {
		str = "hello world";
	}
	
	public static SingletonClass getInstance() {
		if(s == null)
		s = new SingletonClass();
		return s;
	}
	
}


