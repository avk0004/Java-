package ifs;


public class Asci
{
	public static void main(String[] args) {
        String n = "aznj";
        for ( int i = 0; i<n.length();i++){
            char ch = n.charAt(i);
            int h = (int) ch;
            if((h>=96) && (h<122) ){
                h +=1 ;
                System.out.print((char) h);
            }
            else {
                if(h == 122){
                    System.out.print((char) (h-25));
                }
            }
            
        }
        System.out.println("\n");
        String  m = "aAZz";
        for (int j =0; j<m.length();j++){
            char ch = m.charAt(j);
            if((ch>='a') && (ch<='z') ){
                System.out.print((char) (ch-32));
                if(ch == 'z'){
                    ch-=56;
                }
            }
            else 
            {if ((ch>='A') && (ch<='Z')){
                System.out.print((char) (ch+32));
                if(ch == 'Z'){
                    ch+=9;
                }
            }
            }
            
        }
    }
}
