package lab2;

import java.util.Scanner;
public class AverageNumbers {

	public static void main(String[] args) {
		System.out.println("�������������:");
		Scanner input=new Scanner(System.in);
		double int1 =  input.nextDouble(); 
		double int2 =  input.nextDouble();
		double int3 =  input.nextDouble();
		double int4 =  input.nextDouble(); 
		double int5 =  input.nextDouble();
        double avg=(int1+int2+int3+int4+int5)/5;
        double square=Math.sqrt(avg);
        System.out.println("ƽ����Ϊ��"+avg +"\n"+"ƽ����Ϊ��"+square);
          

	}

}
