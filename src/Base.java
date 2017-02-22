
public class Base {
	final static int COUNT = 100;
	final static String MSG = "Gitテスト";
	public Base(){
		for(int i=0;i<COUNT;i++)
			System.out.println(MSG+i);
	}
}
