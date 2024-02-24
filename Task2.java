import java.util.Scanner;

public class Task2 {
    public static int CalculatetotalMarks(int[]marks){
        int totalMarks = 0;
        for(int Marks : marks){
            totalMarks += Marks;
        }
        return totalMarks;
    }

    public static double CalculateAveragePercentage(int totalMarks,int numberOfSubject){
        return (double) totalMarks / numberOfSubject;
    }
    
    public static char AssignGrades(double AveragePercentage){
        if(AveragePercentage >= 90){
            return 'A';
        }
        else if(AveragePercentage >= 80){
           return 'B';
        }
        else if(AveragePercentage >= 70){
            return 'C';
        }
        else if(AveragePercentage >= 60){
            return 'D';
        }
        else{
            return 'F';
        }
    }

    public static void DisplayResults(int totalMarks, double AveragePercentage, char Grades){
        System.out.println("<----Your Result is ---->");
        System.out.println("Your total marks is : " +totalMarks);
        System.out.println("Your average percentage is : " +AveragePercentage);
        System.out.println("Your Score Grade is : " +Grades);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of the subject : ");
        int numberOfSubject = sc.nextInt();
        
        int [] marks = new int[numberOfSubject];
        for(int i=0; i<numberOfSubject; i++){
            System.out.println("Enter marks obtain in a subject is " +(i+1)+ ":");
            marks[i] = sc.nextInt();
        }

        int totalMarks = CalculatetotalMarks(marks);

        double AveragePercentage = CalculateAveragePercentage(totalMarks, numberOfSubject);

        char Grades = AssignGrades(AveragePercentage);

        DisplayResults(totalMarks, AveragePercentage, Grades);
    }
}
