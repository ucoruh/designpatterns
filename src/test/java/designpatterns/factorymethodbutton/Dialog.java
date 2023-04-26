package designpatterns.factorymethodbutton;

public abstract class Dialog {

	public abstract Button createButton();

	public void render() {
		Button okButton = createButton();
		// Now use the product.
		okButton.onClick();
		okButton.render();

	}
}
