
public class StudentManager extends UserManager{

	@Override
	public void createAccount(User user)
	{
		System.out.println("Öğrenci hesabı oluşturuldu.");
	}
}
