import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Sample5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�п�J�r��");
		try {
			BufferedReader br =new 
					BufferedReader(new InputStreamReader(System.in));
			String str =br.readLine();
			System.out.println("�w��J�r��" + str);
			
		}catch (IOException e)
		{
			System.out.println("��J��X���~");
		}
		
	}

}
