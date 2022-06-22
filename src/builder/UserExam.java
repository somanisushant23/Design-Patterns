package builder;

/**
 * UserExam class is used to demonstrate Builder Design pattern
 * Builder design pattern is used where
 *      1. The constructor of a class have multiple parameters
 *      2. Some parameters can be mandatory while others can be optional
 *      3. Make the code more readable
 *      4. One can validate the parameters before creating an instance
 *      5. Telescoping constructors or multiple constructors are not required
 *
 * Builder design pattern can have few disadvantages as well. In order
 * to create an object, one have to first create its builder. The cost
 * of creating this builder is not significant but it could be problematic
 * in performance-critical situations.
 *
 * However, this approach is scalable if developer needs to add more constructor
 * paramters in the future.
 *
 * @author Sushant Somani
 * @since 2022.6
 */
public class UserExam {

    private int mathsMarks;
    private int scienceMarks;
    private int englishMarks;
    private String studentName;

    private UserExam(){}

    public static UserExamBuilder getUserExamBuilder(){
        return new UserExamBuilder();
    }

    public static class UserExamBuilder{

        private int mathsMarks = 34;
        private int scienceMarks = 35;
        private int englishMarks = 40;
        private String studentName = "NA";

        public UserExamBuilder setMathsMarks(int mathsMarks){
            this.mathsMarks = mathsMarks;
            return this;
        }

        public UserExamBuilder setScienceMarks(int scienceMarks){
            this.scienceMarks = scienceMarks;
            return this;
        }

        public UserExamBuilder setEnglishMarks(int englishMarks){
            this.englishMarks = englishMarks;
            return this;
        }

        public UserExamBuilder setStudentName(String studentName){
            this.studentName = studentName;
            return this;
        }

        public UserExam build(){
            if(mathsMarks>100 || scienceMarks >100 || englishMarks>100) throw new IllegalArgumentException("Marks cannot be greatedr than 100!!");

            if(studentName.startsWith("0")) throw new IllegalArgumentException("Invalid student name!!");

            UserExam userExam = new UserExam();
            userExam.mathsMarks = this.mathsMarks;
            userExam.scienceMarks = this.scienceMarks;
            userExam.englishMarks = this.englishMarks;
            userExam.studentName = this.studentName;
            return userExam;
        }
    }
}
