package org.example.topik5.task2_3.answer;

public class Child extends Human {

    // Attributes:
    private String schoolCardNo = "N/A";

    // Setter and Getter
    public void setSchoolCardNo(String schoolCardNo){
        this.schoolCardNo = schoolCardNo;
    }// method

    public String getSchoolCardNo(){
        return schoolCardNo;
    }// method

    // Override the swim() method from Adult
    @Override
    public String swim(){

        if(getAge() <=5 ){
            return "As the child is under 5 years old, armbands must be worn and " +
                    "parental supervision is required. \n" + super.swim();
        }else{
            return super.swim();
        }

    }// method

    public String toString(){
        return super.toString() + "\n" + "School Card No: " + schoolCardNo;
    }

}// class