
public class Pallindrome {
	
	public static void main(String[] args) 
	{
			
		String[] words= {"abc","bcd","aba","cfg","madam"};
		
		for(int i=0;i<words.length-1;i++)
		{
			String rev="";
			for(int j=words[i].length()-1;j>=0;--j) 
			{
				rev= rev + words[i].charAt(j);
			}
				if(words[i].equals(rev)) 
				{
					System.out.println(rev);
					break;
				}	 
				
			}
		}
}
