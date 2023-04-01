package aula06.Ex3;

public class Conjunto {
	private static int[] arrayInt;
	int num;

	public Conjunto() {
	}

	public Conjunto(int num) {
		if (validInt(num)){
			this.num = num;
			insertNum(num);
		}else{
			System.out.println("Numero repetido");
		}
	}
	
	//+:array de int dinamico
	private void insertNum(int num) {
		if (arrayInt == null){
			arrayInt = new int[1];
			arrayInt[0] = num;
		}else{
			int[] newArray = new int[arrayInt.length + 1];
			for (int i = 0; i < arrayInt.length; i++){
				newArray[i] = arrayInt[i];
			}
			newArray[arrayInt.length] = num;
			arrayInt = newArray;
		}
	}

	private Boolean validInt(int num){
		for (int i = 0; i < arrayInt.length; i++){
			if (arrayInt[i] == num){
				return false;
			}
		}
		return true;
	}

	//?: "Inicialmente não se sabe quantos elementos vamos inserir", como aasim?
	public void insert(int num) {
		if (validInt(num)){
			insertNum(num);
		}else{
			System.out.println("Numero repetido");
		}
	}

	public boolean contains(int n){
		for (int num : arrayInt){
			if (num == n){
				return true; //+:o return já dá break
			}
		}
		return false;
	}

	public void remove(int n){
		if (contains(n)){
			int[] newArray = new int[arrayInt.length - 1];
			int i = 0;
			int j = 0; //contador para o novo array
			while( i < arrayInt.length){
				if (arrayInt[i] != n){
					newArray[j] = arrayInt[i];
					j++;
				}
				i++;
			}
		}else{
			System.out.println("Numero nao presente no conjunto");
		}
	}

	//!: não sei como implementar isto
	//+:metodo para limpar a class
	public void empty(){
		
	}

	public String toString(){
		String str = "";
		for (int num : arrayInt){
			str += num + " ";
		}
		return str;
	}

	public int size(){
		return arrayInt.length;
	}
	
	//+: se ficar a funcionar é um otimo exmplo de como combinar 2 arrays
	public Conjunto combine(Conjunto add){
		Conjunto newConjunto = new Conjunto(0);
		for (int num : arrayInt){
			newConjunto.insert(num);
		}
		for (int num : add.arrayInt){//!: como é que faço aqui para aceder ao arrayInt do outro conjunto?
			newConjunto.insert(num); //!: será mesmo necessario que o atributo seja public?
		}
		return newConjunto;
	}

	public Conjunto subtract(Conjunto dif){
		Conjunto newConjunto = new Conjunto(0);
		for (int num : arrayInt){
			if (!dif.contains(num)){
				newConjunto.insert(num);
			}
		}
		return newConjunto;
	}

	public Conjunto intersect(Conjunto inter){
		Conjunto newConjunto = new Conjunto(0);
		for (int num : arrayInt){
			if (inter.contains(num)){
				newConjunto.insert(num);
			}
		}
		return newConjunto;
	}

}
