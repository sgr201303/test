package lab2;
import java.util.Scanner;
public class FarheheitToCentigrade {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("������ѡ��  yes ����"
				+ " no �˳�");
		for(int i =1;i <=2;)
		{
			String flag = sc.nextLine(); 
			switch(flag)
			{
			case "yes":
			System.out.println( "1 λ�����¶�ת���� " +
						"2 Ϊ�����¶�ת����:");
			Scanner input=new Scanner(System.in);
			int key = input.nextInt();
			if(key==1)
			{
				System.out.println("�����뻪���¶�:");
				double tempFarenheit = input.nextDouble();
			    double tempCelcius = (5.0/9.0)*(tempFarenheit -32);
			    System.out.println("�������¶�Ϊ��"+tempFarenheit+"ʱ"+  
			    "\n" +"�����¶�Ϊ��"+tempCelcius);
			}
			else
			{
				System.out.println("�����������¶�:");
				double tempCelcius = input.nextDouble();
			    double tempFarenheit =(9.0/5.0)*tempCelcius +32;
			    System.out.println("�������¶�Ϊ��"+tempCelcius+"ʱ"+  
			    "\n" +"�����¶�Ϊ��"+tempFarenheit);
			}	
			break;
			case "no":
				i=3;
			break;
			}
			System.out.println("�Ƿ�������г���");
		}
		

	}

}
