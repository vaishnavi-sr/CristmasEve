public class Calculator {
    public static int calculator(int num1,char operator,int num2){
        if (operator == '+'){
            return num1+num2;
        }else if(operator == '-'){
            return num1-num2;
        }else if(operator == '*'){
            return num1*num2;
        }else if(operator == '/'){
            return num1/num2;
        }else{
            return '0';
        }
    }

    public static void main(String[] args) {
        System.out.println(calculator(2, '+', 2));

        System.out.println(calculator(4, '/', 2));
    }
}
