package HomeWork_2;

public class Ex_4 {

	public static void main(String[] args) {
		// there is no class and main method inside the exercise so nothing going to be executed

		int n = 7;
		boolean flag = false;
		for (int i = 0; i < 10; i++) {
			if (i == n) {
				flag = true;
				break;
			}
		}
		if (flag){
		System.out.println("Data Found");
	}else{
		System.out.println("Data not Found");
	}
	}// answer is data found
}


