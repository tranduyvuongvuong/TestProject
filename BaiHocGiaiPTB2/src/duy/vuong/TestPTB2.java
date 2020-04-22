package duy.vuong;

import java.util.Scanner;

public class TestPTB2 {
	
	/**
	 * Giải phương trình bậc 2: ax^2 + bx +c = 0
	 * @param a - hệ số a
	 * @param b - hệ số b
	 * @param c - hệ số c
	 */
	
	public static void giaiPTB2(double a, double b, double c)
	{
		if (a==0)
		{
			System.out.println("PT trở thành pt bậc 1");
			if (b==0 && c==0)
			{
				System.out.println("PT Vô số nghiệm");
			}
			else if (b==0 && c!=0)
			{
				System.out.println("PT Vô nghiệm");
			}
			else
			{
				//bx+c=0 => x=-c/b
				System.out.println("PT có nghiệm x = "+(-c/b));
			}
		}
		else
		{
			double delta=b*b-4*a*c;
			if (delta <0)
			{
				System.out.println("PT vô nghiệm");
			} 
			else if (delta == 0)
			{
				System.out.println("PT có nghiệm kép :"+(-b/(2*a)));
			}
			else
			{
				double x1 = (-b+Math.sqrt(delta))/(2*a);
				double x2 = (-b-Math.sqrt(delta))/(2*a);
				System.out.println("PT có 2 nghiệm phân biệt");
				System.out.println("x1 = "+x1+";  x2 = "+x2);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("GIẢI PHƯƠNG TRÌNH BẬC 2");
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Nhập a: ");
			double a=sc.nextDouble();
			System.out.println("Nhập b: ");
			double b=sc.nextDouble();
			System.out.println("Nhập c: ");
			double c=sc.nextDouble();
			giaiPTB2(a,b,c); 
			System.out.println("Tiếp k thiếp? (c/k): ");
			String line=new Scanner(System.in).nextLine();
			if (line.equalsIgnoreCase("k"))
				break;
		} 
		while(true); 
		System.out.println("Cảm ơn thiếp đã dùng phần mềm!");
	}

}
