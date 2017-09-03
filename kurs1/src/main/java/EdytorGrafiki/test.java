package EdytorGrafiki;

import java.awt.EventQueue;

public class test {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				new MyFrame();
			}
		});
	}
}

