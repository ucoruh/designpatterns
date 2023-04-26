package designpatterns.factorymethodbutton;

public class HTMLButton implements Button {

	public void render() {
		System.out.println("HTML Button Render");

	}

	public void onClick() {
		System.out.println("HTML Button Click");

	}

}
