package business.concretes;

import business.abstracts.EmailService;
import business.abstracts.UserService;
import business.abstracts.ValidationService;
import core.AuthService;
import entities.concretes.User;

public class AuthManager implements AuthService {

	private ValidationService validationService;
	private UserService userService;
	private EmailService emailService;

	public AuthManager(ValidationService validationService, UserService userService, EmailService emailService) {
		super();
		this.validationService = validationService;
		this.userService = userService;
		this.emailService = emailService;
	}

	@Override
	public void signIn(String email, String password) {
		User signInUser = userService.getMailAndPassword(email, password);
		if (signInUser == null) {
			System.out.println("Mail veya �ifreniz yanl��");
		} else if (!validationService.userValidation(signInUser)) {
			System.out.println("Do�rulama hatas� bilgilerinizi kontrol ediniz");
		}
		System.out.println(signInUser.getEmail() + " mail adresini kullanarak ba�ar�yla giri� yapt�n!");
	}

	@Override
	public void signUp(int id, String username, String name, String surname, String email, String password) {
		User signUpUser = new User(id, username, name, surname, email, password, false);
		if (!validationService.userValidation(signUpUser)) {
			System.out.println("Do�rulama hatas�. L�tfen bilgilerinizi kontrol ediniz");
		} else if (!(validationService.validEmailUnique(email))) {
			System.out.println("Ba�ka bir email adresi kullan�n�z");
		} else {
			userService.add(signUpUser);
			System.out.println("Kullan�c� olu�turma i�lemi ba�ar�l�");
		}
	}

	@Override
	public boolean twoFactorAuth(String code) {
		if (code == "GOOGLE")
			return true;
		else
			return false;
	}

}
