public class Persona{

	String name;
	String sexo;
	int edad;

		public void caminar(){
			System.out.println(name + " Esta Caminando");
		}
		public void estudiar(){
			System.out.println(name + " Esta Estudiando");
		}
		public void comer(String comida){

			System.out.println(name +" Esta comiendo "+comida);
		}
		public void pedirCerveza(){
			if (edad>=18) {
				System.out.println("Dar Cerveza");
			}
			else{
				System.out.println("no tienes edad");
			}
		}
}



class curso{

	public static void main (String args[]){
		Persona juan = new Persona();
		juan.name= "Juan Perez";
		juan.sexo="Masculino";
		juan.edad=15;
		juan.caminar();
		juan.estudiar();
		juan.comer("nachos con carne");
		juan.pedirCerveza();
		System.out.println("");
		Persona bety=new Persona();
		bety.name="Beatriz";
		bety.sexo="Fem";
		bety.edad=50;
		bety.caminar();
		bety.estudiar();
		bety.comer("torta al pastor");
		bety.pedirCerveza();
	}

}