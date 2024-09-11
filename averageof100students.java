import java.util.Scanner;


public class averageof100students {
    public static void averagefinder(double totalHeight , double totalWeight , int studentcount){


        double averageheight=totalHeight/studentcount;
        double averageweight=totalWeight/studentcount;


        System.out.printf("\nAverage height of the students: %.2f cm\n", averageheight);
        System.out.printf("Average weight of the students: %.2f kg\n", averageweight);


    }
   
    public static void main(String[] args) {


        double totalHeight=0;
        double totalWeight=0;
        int studentcount=100;






        for (int i=0 ; i<5; i++) {
            System.out.println("---------------------");
            Scanner input=new Scanner(System.in);
            System.out.print(i+1+"'S height :");
            double height=input.nextDouble();


            System.out.print(i+1+"'S weight :");
            double weight=input.nextDouble();




            if(height<0){
                System.out.println("Height must be a positive number ");
               
            }
           
            else if(weight<0){
                System.out.println("weight must be a positive number ");
                break;
            }
       


            totalHeight += height;
            totalWeight += weight;
        }


            averagefinder(totalHeight , totalWeight,studentcount);




        }
    }