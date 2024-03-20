
public class Strings2 {

	public static void main(String[] args) {
		String[] words= {"abc","bcd","aaaa","cbc"};
		char x='a';
		for(int i=0;i<words.length-1;i++)
		{
			for(int j=0;j<words[i].length()-1;j++)
			{
				if(words[i].indexOf(x)!=-1) {
					
					System.out.print(i+" ");
					break;
				}
			}	
		}	
	}
}
