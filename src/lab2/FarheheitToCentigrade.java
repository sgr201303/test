package lab2;
import java.util.Scanner;
public class FarheheitToCentigrade {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("请输入选择  yes 运行"
				+ " no 退出");
		for(int i =1;i <=2;)
		{
			String flag = sc.nextLine(); 
			switch(flag)
			{
			case "yes":
			System.out.println( "1 位华氏温度转摄氏 " +
						"2 为摄氏温度转华氏:");
			Scanner input=new Scanner(System.in);
			int key = input.nextInt();
			if(key==1)
			{
				System.out.println("请输入华氏温度:");
				double tempFarenheit = input.nextDouble();
			    double tempCelcius = (5.0/9.0)*(tempFarenheit -32);
			    System.out.println("当华氏温度为："+tempFarenheit+"时"+  
			    "\n" +"摄氏温度为："+tempCelcius);
			}
			else
			{
				System.out.println("请输入摄氏温度:");
				double tempCelcius = input.nextDouble();
			    double tempFarenheit =(9.0/5.0)*tempCelcius +32;
			    System.out.println("当摄氏温度为："+tempCelcius+"时"+  
			    "\n" +"华氏温度为："+tempFarenheit);
			}	
			break;
			case "no":
				i=3;
			break;
			}
			System.out.println("是否继续运行程序");
		}
		

	}

}
