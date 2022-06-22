package builder;

public class Client {

    public UserExam getUserExamInstance(){
        UserExam userExam;
        try {
            //below few lines creates object of UserExam
            //and also sets few/all parameters.
            //Builder design patterns is used to get
            //instance of UserExam class.
            userExam = UserExam.getUserExamBuilder()
                    .setStudentName("Mohan")
                    .setEnglishMarks(98)
                    .setMathsMarks(89)
                    .setScienceMarks(76)
                    .build();

            //userExam2 creates object of UserExam class
            //using default parameters as mentioned in
            //UserExam class.
            UserExam userExam2 = UserExam.getUserExamBuilder().build();

            return userExam;

        }
        catch (Exception exception){

        }

        return null;
    }
}
