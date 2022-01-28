public class Evaluation {
    public static int evaluatePostFix(String S)
    {
        Stack <Integer> st= new Stack<>();
        
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(Character.isDigit(ch)){
                st.push(ch -'0');
            }else{
                int a=st.pop();
                int b=st.pop();
                
                switch(ch){
                    case '+':
                    st.push(b+a);
                    break;
                    case '*':
                    st.push(b*a);
                    break;
                    case '-':
                    st.push(b-a);
                    break;
                    case '/':
                    st.push(b/a);
                    break;
                }
            }
        }
        return st.pop();
    }
}
