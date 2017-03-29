package ctcr_codes;

import java.io.*;
import java.util.*;


public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int num_strings = scanner.nextInt();
		String[] strings = new String[num_strings];
		for(int i=0 ; i<=num_strings ; i++){
			strings[i] = scanner.nextLine();
		}
		
		
		int num_queries = scanner.nextInt();
		String[] queries = new String[num_queries];
		for(int j=0 ; j<= num_queries; j++){
			queries[j] = scanner.nextLine();
		}
		
		scanner.close();
		
		
		
		
			
	}

}
