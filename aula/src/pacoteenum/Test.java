package pacoteenum;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println(UserStatus.ACTIVE);
		
		System.out.println("----------------");
		
		for(UserStatus status : UserStatus.values()) {
			System.out.println(status);
		}
	}

}
