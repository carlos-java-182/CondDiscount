package discount;

import javax.swing.JOptionPane;

public class Discount {

	public static void main(String[] args) {
		
		float price;
		
		price= Float.parseFloat(JOptionPane.showInputDialog("Introduce el precio"));
				
		if(price>300) {
			
			price = price*0.80f;
			JOptionPane.showConfirmDialog(null, "El precio a pagar es: " +price);
		}
		
		else {
			JOptionPane.showConfirmDialog(null, "El precio a pagar sin descuento es: "+price);
		}
				

	}

}
