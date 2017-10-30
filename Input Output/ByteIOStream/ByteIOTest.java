// ByteIOTest.java
import java.io.*;

class MyReader
{	static InputStream myRead(String msg)
	{	try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println(msg);
		String str=br.readLine();
		byte b[]=str.getBytes();
		
		ByteArrayInputStream in=new ByteArrayInputStream(b);
		// bytes are loaded into BArrayInputStream
			return(in);
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
		return(null);
	}
}

// Main class
class ByteIOTest
{
	public static void main(String s[])
	{
		try
		{
		FileOutputStream fout=new FileOutputStream("stud.txt");	
			
	ByteArrayOutputStream bout=null;
	
String msgs[]={"enter the name","enter the course","enter the email","enter the phone no."};

			int i=0;
			while(i<msgs.length)
			{
	InputStream in = MyReader.myRead(msgs[i]);

		byte b[]=new byte[in.available()];
		in.read(b); 
// bytes are copied from the InputStream into the b[]

		bout = new ByteArrayOutputStream();
		bout.write(b); 
// bytes copied into ByteArrayOutputStream from byte[]

		bout.writeTo(fout);
	// bytes are copied into the FileOutputStream
		
		fout.write("\n".getBytes());
			i++;		
			}
		}
		catch(Exception e)
		{	e.printStackTrace();
		}
	}
}
 

