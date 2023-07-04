public class GeneratingPwrSet{
    public static void main(String[] args){
        String str = "abc";
        String[] s = str.split("");
        int len = s.length;
        int totalPwrsets = (1<<len);
        for(int i=0;i<totalPwrsets;i++){
            for(int j=0;j<totalPwrsets;j++){
                if((i & (1<<j))!=0){
                    System.out.print("("+s[j]+")");
                }
            }
            // System.out.println("\n");
        }
    }
}