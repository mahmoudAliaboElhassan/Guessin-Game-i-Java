import javax.swing.JOptionPane;
import java.util.Scanner;
public class first 
{
public static void main(String[]args)
{
Scanner input=new Scanner (System.in);
char []arr=new char[26];
int l=0;
for(int i=97;i<=122;i++)
{
arr[l]=(char)(i);
l+=1;
}
int trial=1;
while(true)
{
String mychar =  JOptionPane.showInputDialog(null,"Write your guessed char ?");
char firstindex=mychar.charAt(0);
int rand= (int)(Math.random()*arr.length);
char arrrandom=arr[rand];
System.out.println(arrrandom);
if(firstindex!=arrrandom)
{
JOptionPane.showMessageDialog(null,"oh No false guessing","Ops try again",JOptionPane.ERROR_MESSAGE);
}
else
{
JOptionPane.showMessageDialog(null,"Successful guessing at trial Number "+trial, "Bravo ",JOptionPane.INFORMATION_MESSAGE);
break;
}
trial++;
}
}

}
