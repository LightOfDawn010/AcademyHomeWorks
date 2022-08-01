package AcademyHomeWorks;

public class Lecture1 {
    private static int sum(int firstNum, int secondNum) {
        int result1 = firstNum + secondNum;
            return result1;
    }
    private static int subtraction(int fitstNum,int secondNum){
        int result2 = fitstNum - secondNum;
        return result2;
    }
    private static int multiply(int fitstNum,int secondNum){
        int result3 = fitstNum * secondNum;
        return result3;
    }
    private static int divide(int fitstNum,int secondNum){
        int result4 = fitstNum / secondNum;
        return result4;

    }
    public static void main(String[] args) {
            int result1 = sum(22,25);
            int result2 = subtraction(12,321);
            int result3 = multiply(12,22);
            int result4 = divide(232,2);
            System.out.println("შემოყვანილი ორი რიცხვის ჯამი უდრის : " + result1);
            System.out.println("შემოყვანილი ორი რიცხვის სხვაობა უდრის: " + result2);
            System.out.println("შემოყვანილი ორი რიცხვის ნამრავლი უდრის: " + result3);
            System.out.println("შემოყვანილი ორი რიცხვის გაყოფა უდრის: " + result4);



    }



}
