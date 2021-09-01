package lambda;

interface Lambda02 {
	public void lam(Object a);
}

public class Ex02 {
	public static void main(String[] args) {
		Lambda02 lam01 = (a) -> {System.out.println("test"+a);
								System.out.println("여러줄 사용가능");
								};
		lam01.lam("안녕");
	}
}
