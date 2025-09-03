class MethodOverloading{
public static void main(String []args){
calculate c1=new calculate();

System.out.println("Sum of two integer : "+c1.add(10,20));
System.out.println("Sum of two integer : "+c1.add(6.4,34.32));
System.out.println("Sum of two integer : "+c1.add(123.43,234.30));
}
}

class calculate{
public int add(int a,int b){
return a+b;
}

public double add(double a,double b){
return a+b;
}

public float add(float a,float b){
return a+b;
}
}