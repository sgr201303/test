package lab2;

public class Payroll {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
    double pay = 25;
    double hoursWorked = 40;
    double grossPay = pay * hoursWorked;
    double taxesWithheld = grossPay *0.15;
    double netPay = grossPay-taxesWithheld;
    System.out.println("ʱн��"+pay +"\n"
    		          +"ʱ����"+ hoursWorked +"\n"
    		          +"˰ǰ��"+ grossPay +"\n"
    		          +"˰��"+ taxesWithheld +"\n"
    		          +"˰��"+ netPay +"\n"
    		          );
	}

}
