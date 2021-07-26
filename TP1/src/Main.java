import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array limiter --> Regulate the amount of products and clients that can be registered
		//121 it's a random number to limit the size of users/products that can be created;
		Scanner ler = new Scanner(System.in);
		int item, id = 10, productId = 10, sellId = 0, arrayLimiter = 121;
		String searchClient, searchProduct;
		Users[] allUsers = new Users[arrayLimiter];
		Product[] allProducts = new Product[arrayLimiter];
		Sells[] allSells = new Sells[2000];
		
		//Instaciar um vetor com diversos objetos vazios do tipo User e Products
		for(int i = 0; i < arrayLimiter;  i++) {
			allUsers[i] = new Users();
			allProducts[i] = new Product();
			
		}
		
		//Instanciar vetor de vendas com objetos vazios
		for(int i = 0; i < 2000; i++) {
			allSells[i] = new Sells();
		}
		
		//Default dataset for clients
		allUsers[0].id = 0;
		allUsers[0].name = "Pedro Henrique";
		allUsers[0].adress = "Paraná";	
		allUsers[0].cellnum = "45 997563421";
		
		allUsers[1].id = 1;
		allUsers[1].name = "William Shakespeare";
		allUsers[1].adress = "Inglaterra";	
		allUsers[1].cellnum = "505 741321";
		
		allUsers[2].id = 2;
		allUsers[2].name = "Hulk Smash";
		allUsers[2].adress = "Marvel Studios";	
		allUsers[2].cellnum = "0000";
		
		allUsers[3].id = 3;
		allUsers[3].name = "Cleiton";
		allUsers[3].adress = "Rio de Janeiro";	
		allUsers[3].cellnum = "34 75684087";
		
		allUsers[4].id = 4;
		allUsers[4].name = "Jorge Henrique";
		allUsers[4].adress = "Bahia";	
		allUsers[4].cellnum = "74 9676987";
		
		allUsers[5].id = 5;
		allUsers[5].name = "Jorginho";
		allUsers[5].adress = "Flórida";	
		allUsers[5].cellnum = "101 55686";
		
		allUsers[6].id = 6;
		allUsers[6].name = "Toretto";
		allUsers[6].adress = "Velozes e Furiosos";	
		allUsers[6].cellnum = "09 876896";
		
		allUsers[7].id = 7;
		allUsers[7].name = "Steve Rogers";
		allUsers[7].adress = "USA";	
		allUsers[7].cellnum = "XXXX";
		
		allUsers[8].id = 8;
		allUsers[8].name = "Peter Parker";
		allUsers[8].adress = "New York";	
		allUsers[8].cellnum = "101 98456743";
		
		allUsers[9].id = 9;
		allUsers[9].name = "Aluizio Matias";
		allUsers[9].adress = "Ponta Redonda";	
		allUsers[9].cellnum = "72 987563219";
		
		//Default dataset for products
		allProducts[0].id = 0;
		allProducts[0].name = "Vanish";
		allProducts[0].description = "Produto de Limpeza de Manchas";
		allProducts[0].price = 15.99;
		allProducts[0].profitPercentage = 30.00;
		allProducts[0].stockQuantity = 300;
		
		allProducts[1].id = 1;
		allProducts[1].name = "Fone de Ouvido";
		allProducts[1].description = "Fone de ouvido com fio da apple";
		allProducts[1].price = 65.00;
		allProducts[1].profitPercentage = 75.00;
		allProducts[1].stockQuantity = 100;
		
		allProducts[2].id = 2;
		allProducts[2].name = "Kimono";
		allProducts[2].description = "Roupa especializada de luta";
		allProducts[2].price = 299.99;
		allProducts[2].profitPercentage = 25.00;
		allProducts[2].stockQuantity = 15;
		
		allProducts[3].id = 3;
		allProducts[3].name = "Playstation 5";
		allProducts[3].description = "Video Games";
		allProducts[3].price = 5000.00;
		allProducts[3].profitPercentage = 20.00;
		allProducts[3].stockQuantity = 50;
		
		allProducts[4].id = 4;
		allProducts[4].name = "Limpol";
		allProducts[4].description = "Detergente";
		allProducts[4].price = 4.99;
		allProducts[4].profitPercentage = 35.50;
		allProducts[4].stockQuantity = 125;
		
		allProducts[5].id = 5;
		allProducts[5].name = "Vela";
		allProducts[5].description = "Vela Aromatizada com cheiro de canela";
		allProducts[5].price = 24.99;
		allProducts[5].profitPercentage = 13.50;
		allProducts[5].stockQuantity = 20;
		
		allProducts[6].id = 6;
		allProducts[6].name = "Oreo";
		allProducts[6].description = "Bolacha Oreo";
		allProducts[6].price = 10.00;
		allProducts[6].profitPercentage = 15.00;
		allProducts[6].stockQuantity = 48;
		
		allProducts[7].id = 7;
		allProducts[7].name = "Jujuba Fini";
		allProducts[7].description = "Doce Cítrico";
		allProducts[7].price = 6.50;
		allProducts[7].profitPercentage = 10.00;
		allProducts[7].stockQuantity = 75;
		
		allProducts[8].id = 8;
		allProducts[8].name = "Chinelo Havaianas";
		allProducts[8].description = "O Chinelo Brasileiro";
		allProducts[8].price = 49.99;
		allProducts[8].profitPercentage = 40.00;
		allProducts[8].stockQuantity = 100;
		
		allProducts[9].id = 9;
		allProducts[9].name = "Mel da Jacinda";
		allProducts[9].description = "Adocidador Natural";
		allProducts[9].price = 7.50;
		allProducts[9].profitPercentage = 25.00;
		allProducts[9].stockQuantity = 50;
		
		
		//register default dataset for Sells
		
		
		do {
			System.out.print("\n**Menu**\n 1- Cadastrar clientes\n"
					+ " 2- Buscar cliente\n"
					+ " 3- Cadastrar novo produto\n"
					+ " 4- Buscar produto\n"
					+ " 5- Cadastrar venda\n"
					+ " 6- Mostrar produtos\n"
					+ " 7- Sair\n");
			System.out.print("O que você deseja fazer: ");
			item = ler.nextInt();
			
			switch (item) {
			case 1:
				System.out.print("Quantos usuários deseja cadastrar: ");
				int amount = ler.nextInt();
				int currentId = id;
				for(int i = id; i < (amount + currentId); i++) {
					allUsers[i].registerUser(id);
					id += 1;
				}
				break;
			case 2:
				System.out.print("Qual o nome do cliente que você busca? ");
				//Veriricar a questão do input quando possui white space
				//On the moment can only search users with names without white spaces
				ler.nextLine();
				searchClient = ler.nextLine();
				boolean isClient = false;
				for(int i = 0; i < id; i++) {
					isClient = allUsers[i].compareUser(searchClient);
					if(isClient) {
						allUsers[i].getUser();
						break;
					}
				}
				if(!isClient) {System.out.print("Usuário não encontrado\n");}
				break;
			case 3:
				System.out.print("Quantos produtos deseja cadastrar: ");
				int productAmount = ler.nextInt();
				int currentProductId = productId;
				for(int i = productId; i < (productAmount + currentProductId); i++) {
					allProducts[i].registerProduct(productId);
					productId += 1;
				}
				break;
			case 4:
				System.out.print("Qual o nome do produto que você busca?");
				//Veriricar a questão do input quando possui white space
				ler.nextLine();
				searchProduct = ler.nextLine();
				boolean isProduct = false;
				for(int i = 0; i < productId; i++) {
					isProduct = allProducts[i].findProduct(searchProduct);
					if(isProduct) {
						allProducts[i].getProduct();
						break;
					}
				}
				if(!isProduct) {System.out.print("Usuário não encontrado\n");}
				break;
			case 5:
				boolean finishSell = false;
				int userSelected, productSelected, amountToBuy, stockAvaible, firstSell = sellId, lastSell = 0;
				double total, totalHoleSell = 0.0;
				String preProductSelection;
				for(int i = 0; i < id; i++) {
					allUsers[i].getAllUsers();	
				}
				System.out.println("Insira o id do cliente que irá realizar a compra: ");
				userSelected = ler.nextInt();
				do {
					for(int i = 0; i < productId; i++) {
						allProducts[i].getAllProducts();	
					}
					System.out.println(
						"Insira o id do produto que o seu cliente irá comprar:\n"
						+ "Para finalizar a compra digite [n]\n"
					);
					preProductSelection = ler.next();
					if(preProductSelection.equalsIgnoreCase("n")) {
						finishSell = true;
						lastSell = sellId;
					} else {
						try {
							System.out.println("Qual a quantia que será comprada desse produto: ");
							amountToBuy = ler.nextInt();
							productSelected = Integer.parseInt(preProductSelection); 
							stockAvaible = allProducts[productSelected].changeProductStock(amountToBuy);
							if (stockAvaible < amountToBuy) {
								amountToBuy = stockAvaible;
							}
							total = allProducts[productSelected].price * amountToBuy;
							allSells[sellId].registerSell(sellId, userSelected, productSelected, amountToBuy, total, allUsers[userSelected].name);
							sellId++;
							totalHoleSell += total;
						} catch(Exception e) {
							System.out.println(e.getMessage());
						}
					}
				} while (!finishSell);
				for(int i = firstSell; i < lastSell; i++) {
					allSells[i].getAllSells();
				}
				System.out.println("Total da compra: R$" + totalHoleSell );
				
				break;
			case 6:
				for(int i = 0; i < arrayLimiter; i++) {
					allProducts[i].getAllProducts();
				}
				break;
			case 7:
				System.out.print("Tchau, volte sempre!\n");
				break;
			default:
				System.out.print("Opção inválida, tente novamente\n");
				
				break;
			}
		}while (item != 7);
	}
}
