public class Lesson07_4{
  public static void main(String args[]){
    double height = Double.parseDouble(args[0]);
    double weight = Double.parseDouble(args[1]);

    // Add here =================================
    Health hea = new Health();
    hea.height = height;
    hea.weight = weight;

    double bmi = hea.colBmi();
    System.out.println("BMI: " + bmi);
    
    double sw = hea.colStdWt();
    System.out.println("standard weight: " + sw);
    // ==========================================

  }
}
