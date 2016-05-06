package lab2;
import java.util.Scanner;

public class Whilevh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		for ( int i = 1; i <10; i++ )
		{
			
			System.out.println("请输入选择  yes 运行"
					+ " no 退出");
			String flag = sc.nextLine(); 
			/*switch (flag)
				{
			case "yes":
				System.out.println("gfdghdfh");
				}
			*/
			if(flag == "yes")
			{
				System.out.println("gfdghdfh");	
				
			}
		}
	}
}
