package StringConcepts;

public class StringPractise {
	
	String longestCommonPrefix(String arr[], int n){
        // code here
        
        String shortest=arr[0];
        int len=0;
        String st="";
        int c=0;
        for (int i=0;i<n;i++)
        {
        	if (arr[i].charAt(i)!=arr[i+1].charAt(i))
        	{
        		return ("-1");
        		
        	}
        	break;
        }
        
        for (int i=1;i<n;i++)
        {
              if(arr[i].length()<shortest.length())
              {
                  shortest=arr[i];
              }
          }
        len=shortest.length();
       for (int i=0;i<n-1;i++) {
    	   for (int j=0;j<len;j++)
    	   {
    		   String s3=arr[i+1];
    	   if(arr[i].charAt(j)==s3.charAt(j))
    	   {
    		   st=shortest.substring(0,j+1);
    	   }
    	   
    	   }
       }
       if (st.length()<=0)
       {
    	   return ("-1");
       }
       else {
	return st;
       }    
        
//************************************************
//        for (int i=1;i<n;i++)
//        {
//            if(arr[i].length()<shortest.length())
//            {
//                shortest=arr[i];
//            }
//        }
//        len=shortest.length();
//        //return shortest;
//       for (int i=0;i<n;i++)
//       {
//    	   String wrd=arr[0];
//    	   for(int j=0;j<len;j++)
//    	   {
//    	      if(wrd.charAt(j)==shortest.charAt(j))
//    	        {
//    	    	  st= shortest.substring(0,j);
//    	        }
//           }
//       }
//	return st;
 //*****************************	
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringPractise sp=new StringPractise();
		String s=sp.longestCommonPrefix(new String[]{"geej","geejk","geej","geejt"}, 4);
		
		System.out.println(s);
		

	}

}
