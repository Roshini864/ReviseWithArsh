class GfG
 {
	String encode(String str)
	{
          //Your code here
          String ans = "";
          int i = 0;
          while(i < str.length()){
              char temp = str.charAt(i);
              int count = 0;
              int j = i;
              while(j < str.length() && str.charAt(j) == temp){
                  j++;
                  count++;
              }
              ans = ans + temp + count;
              i = j;
          }
          return ans;
	}
	
 }
