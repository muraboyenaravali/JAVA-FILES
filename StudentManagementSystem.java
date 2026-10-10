import java.util.*;

class S{
 static Scanner s=new Scanner(System.in);
 static ArrayList<String> st=new ArrayList<>();

 public static void main(String[] a){
  int ch;
  do{
   System.out.println("\n1.Add Student Details 2.View 3.Search 4.Exit");
   ch=s.nextInt(); s.nextLine();

   if(ch==1){
    System.out.print(" STUDENT ID: "); int id=s.nextInt(); s.nextLine();
    System.out.print("Name: "); String n=s.nextLine();
    System.out.print("Marks: "); double m=s.nextDouble();
    System.out.print("Attendance: "); double at=s.nextDouble();
    st.add(id+" | "+n+" | Marks:"+m+" | Attendance:"+at+"%");
   }
   else if(ch==2) for(String x:st) System.out.println(x);
   else if(ch==3){
    System.out.print("Enter ID: "); String id=s.next();
    for(String x:st) if(x.startsWith(id)) System.out.println(x);
   }
  }while(ch!=4);
 }
}