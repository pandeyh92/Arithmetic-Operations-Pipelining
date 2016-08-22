package bonus_assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Piped funtions");
		String fnc=sc.nextLine();
			String fncarr[]=fnc.split("\\|");
			Multiply ml = new Multiply();
			Addition ad = new Addition();
			Subtraction sb = new Subtraction();
			String arr1[]=fncarr[0].split("(?!^)\\b");
			String arr2[]=fncarr[1].split("(?!^)\\b");
			String arr3[]=fncarr[2].split("(?!^)\\b");
			if((arr1[1].equals("+")) && (arr2[0].equals("-"))){
				ad.setNextChain(sb);
				sb.setNextChain(ml);
				ml.setNextChain(null);
				ad.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2]));
				sb.operation(ad.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2])), Float.parseFloat(arr2[1]));
				ml.operation(sb.operation(ad.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2])), Float.parseFloat(arr2[1])), Float.parseFloat(arr3[1]));
				System.out.println("Final output"+ml.operation(sb.operation(ad.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2])), Float.parseFloat(arr2[1])), Float.parseFloat(arr3[1])));
				
			}
			else if((arr1[1].equals("-")) && (arr2[0].equals("+"))){
				sb.setNextChain(ad);
				ad.setNextChain(ml);
				ml.setNextChain(null);
				sb.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2]));
				ad.operation(sb.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2])), Float.parseFloat(arr2[1]));
				ml.operation(ad.operation(sb.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2])), Float.parseFloat(arr2[1])), Float.parseFloat(arr3[1]));
				System.out.println("Final ooutput"+ml.operation(ad.operation(sb.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2])), Float.parseFloat(arr2[1])), Float.parseFloat(arr3[1])));
			}
			else if((arr1[1].equals("+")) && (arr2[0].equals("*"))){
				ad.setNextChain(ml);
				ml.setNextChain(sb);
				sb.setNextChain(null);
				ad.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2]));
				ml.operation(ad.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2])), Float.parseFloat(arr2[1]));
				sb.operation(ml.operation(ad.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2])), Float.parseFloat(arr2[1])), Float.parseFloat(arr3[1]));
				System.out.println("Final ooutput"+sb.operation(ml.operation(ad.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2])), Float.parseFloat(arr2[1])), Float.parseFloat(arr3[1])));
			}
			else if((arr1[1].equals("*")) && (arr2[0].equals("+"))){
				ml.setNextChain(ad);
				ad.setNextChain(sb);
				sb.setNextChain(null);
				ml.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2]));
				ad.operation(ml.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2])), Float.parseFloat(arr2[1]));
				sb.operation(ad.operation(ml.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2])), Float.parseFloat(arr2[1])), Float.parseFloat(arr3[1]));
				System.out.println("Final ooutput"+sb.operation(ad.operation(ml.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2])), Float.parseFloat(arr2[1])), Float.parseFloat(arr3[1])));
			}
			else if((arr1[1].equals("*")) && (arr2[0].equals("-"))){
				ml.setNextChain(sb);
				sb.setNextChain(ad);
				ad.setNextChain(null);
				ml.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2]));
				sb.operation(ml.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2])), Float.parseFloat(arr2[1]));
				ad.operation(sb.operation(ml.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2])), Float.parseFloat(arr2[1])), Float.parseFloat(arr3[1]));
				System.out.println("Final ooutput"+ad.operation(sb.operation(ml.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2])), Float.parseFloat(arr2[1])), Float.parseFloat(arr3[1])));
			}
			else if((arr1[1].equals("-")) && (arr2[0].equals("*"))){
				sb.setNextChain(ml);
				ml.setNextChain(ad);
				ad.setNextChain(null);
				sb.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2]));
				ml.operation(sb.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2])), Float.parseFloat(arr2[1]));
				ad.operation(ml.operation(sb.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2])), Float.parseFloat(arr2[1])), Float.parseFloat(arr3[1]));
				System.out.println("Final ooutput"+ad.operation(ml.operation(sb.operation(Float.parseFloat(arr1[0]), Float.parseFloat(arr1[2])), Float.parseFloat(arr2[1])), Float.parseFloat(arr3[1])));
			}
			else{
				System.out.println("wrong operators");
			}
			sc.close();	
		
		
	}
}


