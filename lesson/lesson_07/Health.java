public class Health{

    double height;
    double weight;
    
    // Add here=======================================================
    public double colBmi() {
      double hei = this.height * 0.01;
      double bmi = this.weight / (hei * hei);
      return bmi;
    }
    public double colStdWt() {
      double hei = this.height * 0.01;
      double sw = (hei * hei) * 22;
      return sw;
    }
    // ===============================================================
}