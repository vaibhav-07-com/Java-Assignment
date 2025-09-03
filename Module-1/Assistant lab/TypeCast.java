//Demonstrate type casting (explicit and implicit).
class TypeCast{
public static void main(String []args){
//implicit casting 
int intvar=100;
long longvar=intvar;
float fvar=longvar;
System.out.println("impicit type casting");
System.out.println("integer value : "+intvar);
System.out.println("long value from integer : "+longvar);
System.out.println("float value from long : "+fvar);

//explicit casting
double dvar=123.45;
float f2var=(float)dvar;
int i2var=(int)f2var;
byte b=(byte)i2var;
System.out.println("explicit  type casting");
System.out.println("double value : "+dvar);
System.out.println("float value from double : "+f2var);
System.out.println("int value from float : "+i2var);
System.out.println("byte value from integer : "+b);

}
}