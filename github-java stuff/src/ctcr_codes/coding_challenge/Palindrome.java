//package coding_challenge;
//
//import java.util.HashSet;
//
//public class Palindrome {
//
//		@SuppressWarnings({ "rawtypes", "unchecked" })
//		public static int retPalinNum (String str)
//
//		{
//
//		if (str == null || str.length() == 0)
//		return 0;
//
//		HashSet hash_pal = new HashSet();
//
//		for (int i = 0; i < str.length(); i++)
//
//		{
//
//		if (!hash_pal.contains(str.charAt(i)))
//
//			hash_pal.add(str.charAt(i));
//
//		else
//
//			hash_pal.remove(str.charAt(i));
//
//		}
//		System.out.println(hash_pal);
//		return hash_pal.size() == 0 ? 0 : hash_pal.size() - 1;
//		
//
//		}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String input = "sushanth";
//		System.out.println(retPalinNum(input));
//		
//	}
//
//}
