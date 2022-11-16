
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class example1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        //Examp1(br);
        //Examp2(br);
        //Examp3(br);
        //Examp4(br);
        //Examp5(br);
        //Examp6(br);
        //Examp7(br);
        /**
         * Başlangıç Seviye Örnekler 
         */
    }
    //#region Examp7

        private static void Examp7(BufferedReader br)throws IOException{
            String [][] dizi;
            System.out.println("Boyutlu Dizideki Değerleri Sıralama");
            System.out.print("Oluşturmak İstediğiniz Dizi Adedi = ");
            int amountFirst = Integer.parseInt(br.readLine());
            System.out.print("Dizinin Boyutunu Giriniz = ");
            int amountSecond = Integer.parseInt(br.readLine());
            dizi = new String[amountFirst][amountSecond];
            for (int i = 0; i < amountFirst; i++) {
                for (int j = 0; j < amountSecond; j++) {
                    System.out.print("Dizinin "+(i+1)+"."+(j+1)+" Elemanını Giriniz = ");
                    dizi[i][j] = br.readLine();
                }
            }
            System.out.println("En büyükten En Küçüğe Sıralama");
            int NotMax=MinNumber(dizi);
            int MaxRows=0;
            int MaxColumns=0;
            
            
            for(int x=0;x<(amountFirst*amountSecond);x++){
                for (int i = 0; i < amountFirst; i++) {
                    for (int j = 0; j < amountSecond; j++) {
                        if(IsNumeric(dizi[i][j])){
                            if(NotMax<Integer.parseInt(dizi[i][j])){

                                NotMax = Integer.parseInt(dizi[i][j]);
                                MaxRows = i;
                                MaxColumns = j;
                            }
                            
                        }
                        
                    }
                }
                dizi[MaxRows][MaxColumns]="*";
                System.out.println((x+1)+". -> "+(MaxRows+1)+"."+(MaxColumns+1)+" = "+NotMax);
                NotMax=MinNumber(dizi);

            }
        }
        public static int MinNumber(String [][] dizi){
            int min=0;
            for (int i = 0; i < dizi.length; i++) {
                for (int j = 0; j < dizi[i].length; j++) {
                    if((IsNumeric(dizi[i][j]))){
                        if(min==0){
                            min = Integer.parseInt(dizi[i][j]);
                        }
                        else{
                            if(min>Integer.parseInt(dizi[i][j])){
                                min = Integer.parseInt(dizi[i][j]);
                            }
                        }
                    }
                }
            }
            return min;
        }
        public static boolean IsNumeric(String str){
            try{
                Integer.parseInt(str);
                return true;
            }catch(Exception e){
                return false;
            }
        }
        
    //#endregion

    //#region Examp6
        private static void Examp6(BufferedReader br)throws IOException{

            System.out.println("Klavyeden girilen herhangi bir tamsayının basamaklarını ayrı ayrı ekrana yazdır..");
            System.out.print("Bir sayı giriniz:");
            int number = Integer.parseInt(br.readLine());
            int remainder = 0;
            int temp = 0;
            while(number!=0){
                remainder=number%10;
                System.out.print(remainder+",");
                number=(number-remainder)/10;
            }
            
            /**
             * Ornek 2
             */
            /*int basamakSayisi = 0;
            int temp = sayi;
            while(temp != 0){
                temp /= 10;
                System.out.println("Temp = "+temp+",");
                basamakSayisi++;
            }
            for(int i = 0; i < basamakSayisi; i++){
                basamak = sayi % 10;
                sayi /= 10;
                System.out.print(basamak+",");
            }*/

        }
    //#endregion

    //#region Examp5

        private static void Examp5(BufferedReader br)throws IOException{
            System.out.println(" • Dışardan Girilen İki Sayı arasındaki tam sayıların, tek sayıların ve çift sayıların toplamını ");
            System.out.print("Enter First Number: ");
            int firstNumber = Integer.parseInt(br.readLine());
            System.out.print("Enter Second Number: ");
            int secondNumber = Integer.parseInt(br.readLine());
            int sumOfOddNumbers = 0, sumOfEvenNumbers = 0, sumOfAllNumbers = 0;
            int swap=0;
            if(firstNumber>secondNumber){
                swap=firstNumber;
                firstNumber=secondNumber;
                secondNumber=swap;
            }
            for (int i = firstNumber; i <= secondNumber; i++) {
                if (i % 2 == 0) {
                    sumOfEvenNumbers += i;
                } else {
                    sumOfOddNumbers += i;
                }
                sumOfAllNumbers += i;
            }
            System.out.println("Sum of Odd Numbers: " + sumOfOddNumbers);
            System.out.println("Sum of Even Numbers: " + sumOfEvenNumbers);
            System.out.println("Sum of All Numbers: " + sumOfAllNumbers);

        }


    //#endregion

    //#region Examp4
        private static void Examp4(BufferedReader br)throws IOException{
            System.out.println("1,2,3,4=> OK,WARNING,ERROR,PANIC");
            System.out.print("Enter A Eror Code:");
            int code = Integer.parseInt(br.readLine());
            switch(code){
                case 1:
                    System.out.println("OK");
                    break;
                case 2:
                    System.out.println("WARNING");
                    break;
                case 3:
                    System.out.println("ERROR");
                    break;
                case 4:
                    System.out.println("PANIC");
                    break;
                default:    
                    System.out.println("UNKNOWN");
                    break;
            }

        }
    //#endregion

    //#region Examp3
        private static void Examp3(BufferedReader br) throws IOException{
            System.out.println("İki Sayıdan Önce Küçük Olnı Sonra Büyük Olanı Yazdırma");
            System.out.print("Enter First Number : ");
            int number1=Integer.valueOf(br.readLine());
            System.out.print("Enter Last Number : ");
            int number2=Integer.valueOf(br.readLine());
            int swap=0;
            for (int i = 0; i < 2; i++) {
                if (number1>number2) {
                    swap=number1;
                    number1=number2;
                    number2=swap;
                }
                
            }
            System.out.println("Small Number:"+number1);
            System.out.println("Big Number:"+number2);
            

        }
    //#endregion

    //#region Examp2

        private static void Examp2(BufferedReader br) throws IOException {
            System.out.println("Bir Sayının Çift mi Tek mi Olduğunu Bulma");
            System.out.print( "Enter Number : ");
            int number = Integer.parseInt(br.readLine());
            if(number%2==0){
                System.out.println("Number even");
            }
            else{
                System.out.println("Number odd");
            }

        }
            

    //#endregion

    //#region Examp1
    public static void Examp1(BufferedReader br) throws IOException{
        System.out.println("Hello World! I am a java program.");
        int number = Integer.parseInt(br.readLine());
        System.out.println("you entereding exam grade: "+Integer.valueOf(number));
        System.out.println("exam success score "+ExamGrade(number));
    }
    public static String ExamGrade(int grade){
        String gradeReply="";
        if(grade>=90){
            gradeReply="A";
        }
        else if(grade>=80){
            gradeReply="B";
        }
        else if(grade>=70){
            gradeReply="C";
        }
        else if(grade>=60){
            gradeReply="D";
        }
        else{
            gradeReply="F";
        }
        return gradeReply;
    }
    //#endregion
}
