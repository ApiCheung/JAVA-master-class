package com.Bank;

/**
 * @author Esmee Zhang
 * @date 6/10/20 4:11 下午
 * @projectName JAVA-master-class
 */
public class Floor {
    private double width,length;
    public Floor(double width, double length){
        setWidth(width);
        setLength(length);



    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0){
            this.width = 0;
        }else{
            this.width = width;

        }

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length < 0){
            this.length = 0;
        }else{
            this.length = length;

        }

    }
    public double getArea(){
        return this.width * this.length;

    }
}

