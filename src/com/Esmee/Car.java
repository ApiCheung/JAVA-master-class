package com.Esmee;

/**
 * @author Esmee Zhang
 * @date 6/9/20 4:53 下午
 * @projectName JAVA-master-class
 */
public class Car {
    //class template
    private int doors;
    private int wheels;
    private String model;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("holden")){
            this.model = model;

        }else{
            this.model = "Unknown";
        }


    }
    public String getModel(){
        return this.model;
    }
    //why use:
    //


}
