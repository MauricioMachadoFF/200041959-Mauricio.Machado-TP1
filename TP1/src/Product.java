import java.util.Scanner;

public class Product {
	public Scanner inputInfo = new Scanner(System.in);
	public String name, description;
	public double price, profitPercentage;
	public int stockQuantity, id;

	public void registerProduct(int id) {
		this.id = id;
		System.out.print("Qual o nome do " + id + "º produto:\n");
		name = inputInfo.nextLine();
		System.out.print("Qual a descrição do " + id + "º produto:\n");
		description = inputInfo.nextLine();
		System.out.print("Qual o preço do " + id + "º produto:\n");
		price = inputInfo.nextDouble();
		System.out.print("Qual o porcentagem de lucro do " + id + "º produto:\n");
		profitPercentage = inputInfo.nextDouble();
		System.out.print("Qual o quantidade em estoque do " + id + "º produto:\n");
		stockQuantity = inputInfo.nextInt();
		System.out.println("Produto cadastrado com sucesso");
	}
	
	public boolean findProduct(String nameToSearch) {
		boolean result;
		// false --> Esse produto não é compatível com a busca
		// true --> Esse produto é compatível com a busca
		if(name.equalsIgnoreCase(nameToSearch)) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}
	
	public void getProduct() {
		System.out.print(
			"\n Produto encontrado! \n"
			+ "Nome: " + name + "\n"
			+ "Descrição: " + description + "\n"
			+ "Preço: R$" + price + "\n"
			+ "Porcentagem de lucro: %" + profitPercentage + "\n"
			+ "Quantidade em estoque: " + stockQuantity + " unidades\n\n" 
			+ "Deseja alterar alguma informação:\n"
			+ "1- Sim\n"
			+ "2- Não\n"
		);
		if(inputInfo.nextInt() == 1) {
			changeProduct();
		} else {
			System.out.print("Retornando ao menu principal\n");
		}
	}
	
	public void getAllProducts() {
		if (name != null) {
			System.out.print(
					"\nId do Produto: " + id + "\n"
					+ "Nome: " + name + "\n"
					+ "Descrição: " + description + "\n"
					+ "Preço: R$" + price + "\n"
					+ "Porcentagem de lucro: %" + profitPercentage + "\n"
					+ "Quantidade em estoque: " + stockQuantity + " unidades\n\n" 
				);
		}
	}
	
	public int changeProductStock(int quantityBought) {
		int stockBeforeSell = stockQuantity;
		
		if((stockQuantity - quantityBought) <= 0 ) {
			stockQuantity = 0;
		} else {
			stockQuantity -= quantityBought;
		}
		return stockBeforeSell;
	}
	
	public void changeProduct() {
		//When making a change, it prints the next question (wanna change the xxx) before the input ...
		int makeChange;
		System.out.print("Deseja alterar o nome?\n 1-Sim\n 2-Não\n");
		makeChange = inputInfo.nextInt();
		if(makeChange == 1){
			System.out.print("Digite o nome atualizado: \n");
			inputInfo.nextLine();
			name = inputInfo.nextLine();
		}
		
		System.out.print("Deseja alterar a descrição?\n 1-Sim\n 2-Não\n");
		makeChange = inputInfo.nextInt();
		if(makeChange == 1){
			System.out.print("Digite a descrição atualizado: \n");
			inputInfo.nextLine();
			description = inputInfo.nextLine();
		}
		
		System.out.print("Deseja alterar o preço? \n 1-Sim\n 2-Não\n");
		makeChange = inputInfo.nextInt();
		if(makeChange == 1){
			System.out.print("Digite o preço atualizado: \n");
			price = inputInfo.nextDouble();
		}
		
		System.out.print("Deseja alterar o percentual de lucro?\n 1-Sim\n 2-Não\n");
		makeChange = inputInfo.nextInt();
		if(makeChange == 1){
			System.out.print("Digite o percentual de lucro atualizado: \n");
			profitPercentage = inputInfo.nextDouble();
		}
		
		System.out.print("Deseja alterar a quantidade em estoque?\n 1-Sim\n 2-Não\n");
		makeChange = inputInfo.nextInt();
		if(makeChange == 1){
			System.out.print("Digite a quantidade em estoque atualizada: \n");
			stockQuantity = inputInfo.nextInt();
		}
		
		System.out.print(
			"\n Produto encontrado! \n"
			+ "Nome: " + name + "\n"
			+ "Descrição: " + description + "\n"
			+ "Preço: R$" + price + "\n"
			+ "Porcentagem de lucro: %" + profitPercentage + "\n"
			+ "Quantidade em estoque: " + stockQuantity + "\n\n" 
		);
	}
}
