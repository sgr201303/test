package lab2;

import java.util.Scanner;
public class AverageNumbers {

	public static void main(String[] args) {
		System.out.println("请输入五个数字:");
		Scanner input=new Scanner(System.in);
		double int1 =  input.nextDouble(); 
		double int2 =  input.nextDouble();
		double int3 =  input.nextDouble();
		double int4 =  input.nextDouble(); 
		double int5 =  input.nextDouble();
        double avg=(int1+int2+int3+int4+int5)/5;
        double square=Math.sqrt(avg);
        System.out.println("平均数为："+avg +"\n"+"平方根为："+square);
          

	}

}
