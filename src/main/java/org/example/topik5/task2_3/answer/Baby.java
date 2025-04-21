package org.example.topik5.task2_3.answer;

public class Baby extends Human {

    // Attribute
    private boolean isTeething = false;

    // Setter and Getter
    public void setIsTeething(boolean isTeething){
        this.isTeething = isTeething;
    }// method

    public boolean getIsTeething(){
        return isTeething;
    }// method

    @Override
    public String sleep(){
        if(isTeething == true){
            return "Baby having difficulty sleeping due to teething pain.";
        }else{
            return super.sleep();
        }
    }

    @Override
    public String swim(){
        return "A baby cannot swim safely..";
    }

    public String toString(){
        return super.toString() + "\n" + "Teething: " + isTeething;
    }

}// class
