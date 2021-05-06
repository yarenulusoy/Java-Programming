package inheritanceExample;

public class UserManager {
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + "silindi.");
	}
	public void update(User user) {
		System.out.println(user.getFirstName() + "guncellendi.");
	}
	

}
