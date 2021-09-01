package lambda;

interface Lambda01 {
	public void lam();
}

class Test01 implements Lambda01 {

	@Override
	public void lam() {
		System.out.println("람다 실행");

	}

}

public class Ex01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		t.lam();
		
		Lambda01 lam01=new Lambda01() {
			@Override
			public void lam() {
				System.out.println("인터페이스 객체 생성");
			}
		};
		
		lam01.lam();
		//위의 식이 이렇게 변함
		Lambda01 lam02 = () ->System.out.println("람다식 객체 생성");
		lam02.lam();
		//람다식 메소드는 무조건 1개
	}
}
