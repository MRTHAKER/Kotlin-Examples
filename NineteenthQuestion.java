public class NineteenthQuestion{
    public static void main(String[] args) {
        String target="( [ ) ]",target2="( ) [ ] { }",target3="( )",target4="( { [ )";
        target=target.replaceAll(" ","");
        //target2=target2.replaceAll(" ", "");
        //target3=target3.replaceAll(" ", "");
        //target4=target4.replaceAll(" ", "");
        System.out.println(CheckExp(target));
        //System.out.println(CheckExp(target2));
        //System.out.println(CheckExp(target3));
        //System.out.println(CheckExp(target4));
    }
    public static Boolean CheckExp(String target) {
        boolean flag = false;
        if (target.length() < 2 || target.length()%2!=0 ) {
            return flag;
        }//([)]
        //( ) [ ] { }
        int first,last;
        while(true) {
            first=target.length();
                target = target.replace("()", "");
                target = target.replace("{}","");
                target = target.replace("[]","");
                last=target.length();
                if(first==last)
                    break;
                flag= target.length() == 0;
        }
        return flag;
    }
}
