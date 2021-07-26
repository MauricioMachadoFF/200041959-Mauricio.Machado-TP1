import java.text.DecimalFormat;

public class Sells {
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	public int sellId, clientId, productId, productAmount;
	public double total;
	String clientName;
	
	public void registerSell(
			int sellId, 
			int clientId,
			int productId,
			int productAmount,
			double total,
			String clientName
	) {
		this.sellId = sellId;
		this.clientId = clientId;
		this.productId = productId;
		this.productAmount = productAmount;
		this.total = total;
		this.clientName = clientName;
	}
	
	
	public void getAllSells() {
		if (clientName != null) {
			System.out.print(
					"\nId da Venda: " + sellId + "\n"
					+ "Id do cliente: " + clientId + "\n"
					+ "Id do produto: " + productId + "\n"
					+ "Nome do cliente "+ clientName + "\n"
					+ "Quantia comprada: " + productAmount + "\n"
					+ "Total da compra: R$" + df2.format(total) + "\n\n"
				);
		}
	}
}
