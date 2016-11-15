package QuickCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class code03 {
	

	public static void main(String[] args) throws IOException, OverException {
		// TODO Auto-generated method stub


		try{
			int num1= readNum1();
			
			int num2= readNum2();

			System.out.println(num1/num2);
		//	System.out.println(x);
			
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌수 없습니다");
		}catch(NumberFormatException e){
			System.out.println("문자열이 숫자가 아닙니다");
		}catch(OverException e){
			System.out.println(e.getMessage());
		}
	}
	public static int readNum1() throws OverException, IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String inputNum1=in.readLine();
		if(inputNum1.length()>3){
			throw new OverException();
		}
		return Integer.parseInt(inputNum1);
	}
	public static int readNum2() throws OverException, IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String inputNum2=in.readLine();
		if(inputNum2.length()>3){
			throw new OverException();
		}
		return Integer.parseInt(inputNum2);
	}

}

class OverException extends Exception{
	public OverException(){
		super("세자릿수를 넘어갑니다");
	}
}
