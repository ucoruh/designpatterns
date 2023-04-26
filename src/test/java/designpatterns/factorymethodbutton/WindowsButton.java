package designpatterns.factorymethodbutton;

public class WindowsButton implements Button {

	public void render() {
		System.out.println("Windows Button Render");

	}

	public void onClick() {
		System.out.println("Windows Button Click");

	}

}
