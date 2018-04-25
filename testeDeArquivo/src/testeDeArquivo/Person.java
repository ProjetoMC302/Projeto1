package testeDeArquivo;

public class Person {
	
	/*** Attributes ***/
	private static int idGen = 0;
	private int id;
	private String name;
	
	/*** Constructor ***/
	public Person(String name) {
		this.name = name;
		this.id = idGen++;
	}
	
	public Person(int id, String name) {
		this.name = name;
		this.id = id;
	}
	
	/*** Methods ***/
	public static int getIdGen() {
		return idGen;
	}

	public static void setIdGen(int idGen) {
		Person.idGen = idGen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		String out;
		out = getId() + " | " + getName() + "\n";
		return out;
	}
}
