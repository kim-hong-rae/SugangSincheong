import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginDialog extends JDialog {
	private static final long serialVersionUID = 1L;

	private JTextField tfId;
	private JPasswordField tfPassword;

	private SLogin sLogin;

	public LoginDialog(Frame parent) {
		super(parent);
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();

		jp1.setLayout(new FlowLayout());
		this.setSize(400, 200);
		add(jp1);

		jp2.setLayout(new GridLayout(3, 2));

		JLabel lbId = new JLabel("아이디");
		jp2.add(lbId);

		this.tfId = new JTextField();
		this.tfId.setColumns(10);
		jp2.add(this.tfId);

		JLabel lbPassword = new JLabel("비밀번호");
		jp2.add(lbPassword);

		this.tfPassword = new JPasswordField();
		this.tfPassword.setColumns(10);
		jp2.add(this.tfPassword);

		JButton btLogin = new JButton("로그인");
		jp2.add(btLogin);
		jp1.add(jp2);

		ActionHandler actionHandler = new ActionHandler();
		btLogin.addActionListener(actionHandler);

		this.sLogin = new SLogin();
	}

	private void login() {
		String id = this.tfId.getText();
		String password = this.tfPassword.getText();

		VLogin vLogin = sLogin.login(id);
		if (vLogin == null) {
			// 아이디가 없거나 비밀번호가 틀렸습니다.
		}

	}

	private class ActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			login();
		}
	}
}
