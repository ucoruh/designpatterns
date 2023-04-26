package designpatterns.factorymethodbutton;

public class FactoryMethodButton {

	public static void main(String[] args) {

		Dialog dialog = null;

		if (false) {
			dialog = new WebDialog();
		} else {
			dialog = new WindowsDialog();
		}
		
		dialog.render();
	}

}
