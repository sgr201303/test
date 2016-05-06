package lab2;

public class Payroll {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    double pay = 25;
    double hoursWorked = 40;
    double grossPay = pay * hoursWorked;
    double taxesWithheld = grossPay *0.15;
    double netPay = grossPay-taxesWithheld;
    System.out.println("时薪："+pay +"\n"
    		          +"时长："+ hoursWorked +"\n"
    		          +"税前："+ grossPay +"\n"
    		          +"税："+ taxesWithheld +"\n"
    		          +"税后："+ netPay +"\n"
    		          );
	}

}
