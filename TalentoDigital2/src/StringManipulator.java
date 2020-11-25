
public class StringManipulator {
	
	public String trimAndConcat(String cad1, String cad2) {
		String cad3 = (cad1.trim()).concat((cad2.trim())); 
		return cad3;
	}
	 public Integer getIndexOrNull(String cad, char car) {
		 int x = cad.indexOf(car);
		 if(x==-1) {
			 return null;
		 }else {
			 return x;
		 }
	 }
	 public Integer getIndexOrNull(String cad1, String cad2) {
		 int a = cad1.indexOf(cad2);
		 if(a==-1) {
			 return null;
		 } else {
			 return a;
			 }
	 }
	 public String concatSubstring(String cad1, int num1, int num2, String cad2) {
		 String substr1 = cad1.substring(num1, num2);
		 String substr2 = substr1.concat(cad2);
		 return substr2;
	 }
	
	public static void main(String[] args) {
		StringManipulator manipulator = new StringManipulator();
		//ejercicio1
		//String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
		//System.out.println(str);
		
		//ejercicio2
		/*char letter = 'n';
		Integer a = manipulator.getIndexOrNull("Coding", letter);
		Integer b = manipulator.getIndexOrNull("Hola Mundo", letter);
		Integer c = manipulator.getIndexOrNull("Saludar", letter);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		*/
		
		//ejercicio3
		/*String word = "Hola";
		String subString = "la";
		String notSubString = "mundo";
		Integer a = manipulator.getIndexOrNull(word, subString);
		Integer b = manipulator.getIndexOrNull(word, notSubString);
		System.out.println(a);
		System.out.println(b);
*/
		//ejercicio4
		String word = manipulator.concatSubstring("Hola", 1, 2, "mundo");
		System.out.println(word); // omundo




	}

}
