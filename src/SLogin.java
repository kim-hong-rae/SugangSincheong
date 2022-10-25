
public class SLogin {
	
	private EAccount eAccount;
	public SLogin() {
		this.eAccount = new EAccount();
	}

	public VLogin login(String id) {
		VLogin vLogin = this.eAccount.getLogin(id);
		return vLogin;
	}

}
