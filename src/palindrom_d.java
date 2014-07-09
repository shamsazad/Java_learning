
public class palindrom_d {
	
	public boolean checker(String d)
	{
		 int len,len1,i=0;
		 String n=d.replaceAll("\\W+","");
		 
		 len = n.length();
		 len1 = len;
		 
		while(len1 != (len/2))
		{
			if(Character.toLowerCase(n.charAt(i)) == Character.toLowerCase (n.charAt(len1-1)))
			{
				i++;
				len1--;
			}
			else
				return false;
		}
		
		
		System.out.println(n);
		return true;
		
	}

}
