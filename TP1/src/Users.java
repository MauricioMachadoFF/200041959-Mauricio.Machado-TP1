import java.util.Scanner;

public class Users {
	public Scanner inputInfo = new Scanner(System.in); 
	public String name, adress, cellnum;
	public int id;
	
	public void registerUser(int id) {
		this.id = id;
		System.out.print("Qual o nome do seu " + id + "º cliente:\n");
		name = inputInfo.nextLine();
		System.out.print("Qual o endereço do seu " + id + "º cliente:\n");
		adress = inputInfo.nextLine();
		System.out.print("Qual o número de celular do seu " + id + "º cliente:\n");
		cellnum = inputInfo.nextLine();
		System.out.println("Usuário criado com sucesso!");
	}
	
	public boolean compareUser(String nameToSearch) {
		boolean result;
		// false --> Esse cliente não é compatível com a busca
		// true --> Esse cliente é compatível com a busca
		if(name.equalsIgnoreCase(nameToSearch)) {
			result = true;
		} else {
			result = false;
		}
		//Need to manage error so when user dont exist
//		if (this.name == null) {
//			return result;
//		}
		return result;
	}
	
	public void getUser() {
		System.out.print(
			"\nCliente encontrado! \n"
			+ "Nome: " + name + "\n"
			+ "Endereço: " + adress + "\n"
			+ "Número de celular: " + cellnum + "\n\n"
			+ "Deseja alterar alguma informação:\n"
			+ "1- Sim\n"
			+ "2- Não\n"
		);
		if(inputInfo.nextInt() == 1) {
			changeUser();
		} else {
			System.out.print("Retornando ao menu principal\n");
		}
	}
	
	public void getAllUsers() {
		if (name != null) {
			System.out.print(
					"\nId do Cliente: " + id + "\n"
					+ "Nome: " + name + "\n"
					+ "Endereço: " + adress + "\n"
					+ "Número de celular: " + cellnum + "\n\n"
				);
		}
	}
	
	public void changeUser() {
		// How can i refactor the repeated nextline
		int changeName, changeAdress, changeCellnum;
		System.out.print("Deseja alterar o nome?\n 1-Sim\n 2-Não\n");
		changeName = inputInfo.nextInt();
		if(changeName == 1){
			System.out.print("Digite o nome atualizado: \n");
			inputInfo.nextLine();
			name = inputInfo.nextLine();
		}
		
		System.out.print("Deseja alterar o endereço?\n 1-Sim\n 2-Não\n");
		changeAdress = inputInfo.nextInt();
		if(changeAdress == 1){
			System.out.print("Digite o endereço atualizado: \n");
			inputInfo.nextLine();
			adress = inputInfo.nextLine();
		}
		
		System.out.print("Deseja alterar o número de celular?\n 1-Sim\n 2-Não\n");
		changeCellnum = inputInfo.nextInt();
		if(changeCellnum == 1){
			System.out.print("Digite o número de celular atualizado: \n");
			inputInfo.nextLine();
			cellnum = inputInfo.nextLine();
		}
		
		System.out.print(
			"Usuário atualizado!\n"
			+ "Nome: " + name + "\n"
			+ "Endereço: " + adress + "\n"
			+ "Número de celular: " + cellnum + "\n\n"
		);
	}
}