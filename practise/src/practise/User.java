package practise;

public class User {

	private final String name;
	private final int age;
	private final String address;
	
	private User(UserBuilder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.address = builder.address;
	}

	public String getname() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAdress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "User: " + this.name +" "+this.age +" "+this.address;
	}
	
	public static class UserBuilder{
		private final String name;
		private int age;
		private String address;
		
		public UserBuilder(String name) {
			this.name = name;
		}
		public UserBuilder age(int age) {
			this.age = age;
			return this;
		}
		public UserBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			return user;
		}
		
		
		
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    User user1 = new User.UserBuilder("raj")
		    		.age(28)
		    		.address("jsgja67886899")
		    		.build();
		    System.out.println(user1);
		    
		    User user2 = new User.UserBuilder("raja")
		    		.age(28)
		    		.build();
		    System.out.println(user2);
		    
		    User user3 = new User.UserBuilder("rajesh")
		    		.build();
		    System.out.println(user3);
		    		
		    		
	}

}