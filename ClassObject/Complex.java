package ClassObject;
public class Complex{
   private  int real,imag; 

     void print()
     {
        System.out.println(real +"+i"+ imag);
     }
     
     Complex(int x, int y)
     {
        real = x;
        imag = y;
     } 

     void add(Complex c)
     {
        real = real+c.real;
        imag = imag+c.imag;
     }
}