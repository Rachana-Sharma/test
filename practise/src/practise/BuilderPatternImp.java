package practise;

public class BuilderPatternImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    User user1 = new User.UserBuilder("raj11")
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
