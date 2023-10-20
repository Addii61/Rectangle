/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testrectange;

/**
 *
 * @author cui
 */
public class Rectangle {
    private int length;
    private int wedth;
    public Rectangle(){
        this.length=1;
        this.wedth=1;
    }
    public void SetLength(int a){
        this.length=a;
    }
    public void SetWedth(int b){
        this.wedth=b;
    }
    public int getLength(){
        return this.length;
    }
     public int getWedth(){
        return this.wedth;
    }
     public void perimeter(){
         if (this.length>0&&this.length<20&&this.wedth>0&&this.wedth<20){
         System.out.printf("Perimeter of Rectengle is:%d\n", 2*this.length+2*this.wedth);
         }else{ 
             System.out.print("Enter a right number");
         }
             } 
     public void Area(){
         if (this.length>0&&this.length<20&&this.wedth>0&&this.wedth<20){
         System.out.printf(" Area is:%d", this.length*this.wedth);
         }else{ 
             System.out.print("Enter a right number");
         }
             }     
}
