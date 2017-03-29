package coding_challenge;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    int highest = (int) (Math.pow(9, 7) * -1);

	    int[][] array = new int[6][6];
	    for (int z = 0; z < 6; z++) {
	        String[] line = sc.nextLine().split(" ");
	        int index = 0;
	        for (String str : line) {
	            array[z][index] = Integer.parseInt(str);
	            index++;
	        }
	    }
	    for (int z = 0; z < 4; z++) {
	        int[] hourGlass = new int[7];
	        for (int y = 0; y < 4; y++) {
	            for (int x = 0; x < 7; x++) {
	                switch (x) {
	                case 0:
	                    hourGlass[x] = array[z][y];
	                    break;
	                case 1:
	                    hourGlass[x] = array[z][y + 1];
	                    break;
	                case 2:
	                    hourGlass[x] = array[z][y + 2];
	                    break;
	                case 3:
	                    hourGlass[x] = array[z + 1][y + 1];
	                    break;
	                case 4:
	                    hourGlass[x] = array[z + 2][y];
	                    break;
	                case 5:
	                    hourGlass[x] = array[z + 2][y + 1];
	                    break;
	                case 6:
	                    hourGlass[x] = array[z + 2][y + 2];
	                    break;
	                }

	            }
	            int sum = 0;

	            for (int x : hourGlass) {
	                sum += x;
	            }
	            highest = sum > highest ? sum : highest;

	        }

	    }
	    System.out.println(highest);
	}

}
