package testeDeArquivo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static ArrayList<Person> p = new ArrayList<Person>();
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("people.txt");
		f.delete();
		if (checkIfPeopleTxtExists()) {
			if(loadPeopleTxt()) {
				System.out.println("Objetos carregados e instanciados\n");
			}
			else {
				System.out.println("Falha ao dar load\n");
			}
		}
		else {
			if (createPeopleTxt()) {
				System.out.println("Arquivo criado\n");
			}
			else {
				System.out.println("Falha ao criar arquivo\n");
			}
			if(loadPeopleTxt()) {
				System.out.println("Objetos carregados e instanciados\n");
			}
			else {
				System.out.println("Falha ao dar load\n");
			}
			addPerson("Nome#1");
			addPerson("Nome#2");
		}
		
		for(Person aux : p) {
			System.out.print(aux.toString());
		}
	}
	private static boolean checkIfPeopleTxtExists() {
		File file = new File("people.txt");
		return file.exists();
	}
	private static boolean createPeopleTxt() {
		File file = new File("people.txt");
		try {
			file.createNewFile();
			FileWriter fw = new FileWriter(file);
			fw.write("1\r\n"); // A primeira linha do arquivo e o gerador de id
			fw.close();
			return true;
		} catch (IOException e) {
			return false;
		}
	}
	private static boolean loadPeopleTxt() {
		String s;
		String[] aux;
		File file = new File("people.txt");
		Scanner sc;
		try {
			sc = new Scanner(file);
			if (sc.hasNextLine()) { // Lemos a primeira linha seaparadamente das outras pois esta tem o gerador de id
				Person.setIdGen(Integer.parseInt(sc.nextLine()));
			}
			while (sc.hasNextLine()) { // Agora lemos pessoas
				s = sc.nextLine();
				aux = s.split("&"); // Temos um array {"id", "nome}
				p.add(new Person(Integer.parseInt(aux[0]), aux[1])); // Instanciamos a pessoa lida
			}
			sc.close();
			return true;
		} catch (FileNotFoundException e) {
			return false;
		}
	}
	
	private static boolean addPerson(String name) throws IOException {
		String aux;
		File file = new File("people.txt");
		FileWriter fw = new FileWriter(file, true); // o parametro true significa que ira concatenar o que mandarmos ele escrever ao inves de substituir
		p.add(new Person(name));
		aux = String.valueOf(p.get(p.size() - 1).getId());
		aux += "&" + name + "\r\n";
		fw.append(aux); 
		fw.close();
		updateIdGen();
		return true;
	}
	
	private static boolean removePerson(int id) {
		/* Um tanto analo à update idGen, copiamos o arquivo ate a linha onde queremos remover a pessoa,
		 * pulamos a linha que contem a pessoa e continuamos a copiar o arquivo, pro fim sobreescrevemos
		 * o arquivo (sei que n parece mto eficiente mas aprentemente a internet toda faz assim)*/
		return true;
	}
	
	private static void updateIdGen() throws IOException {
		int newId = Person.getIdGen();
		String newContent;
		File file = new File("people.txt");
		Scanner scan = new Scanner(file);
		newContent = String.valueOf(newId) + "\r\n";
		if(scan.hasNextLine()) {
			scan.nextLine();// Pulamos a primeira linha ja que e esta que vamos substituir
		}
		while (scan.hasNextLine()) {
			newContent += scan.nextLine() + "\r\n";
		}
		System.out.println("New Content : \n" + newContent);
		FileWriter fw = new FileWriter(file);
		fw.write(newContent);
		fw.close();
		scan.close();
	}
}
