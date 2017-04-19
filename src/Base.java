
public class Base {
	final static int COUNT = 77;
	final static String MSG = "Gitテスト";
	public Base(){
		for(int i=COUNT-1;i>=0;i--)
			System.out.println(MSG+i);
	}
}
