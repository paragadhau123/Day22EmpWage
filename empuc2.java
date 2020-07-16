public class empuc2 {
   int IS_FULL_TIME=1;
   int EMP_RATE_PER_HOUR=20;

   public void empWage(){
      int emphrs=0;
      int empwage=0;

      double empcheck = Math.floor(Math.random() * 10) % 2;

      if (empcheck == IS_FULL_TIME){
        emphrs=8;
      }

      empwage=emphrs * EMP_RATE_PER_HOUR;

      System.out.println("EMPWAGE="+empwage);
     }

    public static void main(String [] args){
      empuc2 e=new empuc2();
      e.empWage();
     }
   }
