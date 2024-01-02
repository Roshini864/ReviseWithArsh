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



	 //using single for loop
	 StringBuilder ans = new StringBuilder();
          int count = 0;
          char c = str.charAt(0);
          char ch = '\0';
          
          for(char i: str.toCharArray()){
              if(i == c){
                  count++;
              }
              else{
                  ans.append(c);
                  ans.append(count);
                  c = i;
                  count = 1;
              }
              ch = i;
          }
          ans.append(c);
          ans.append(count);
          return ans.toString();
	
 }
