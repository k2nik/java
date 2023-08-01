package days14;

public class Car {
	
	// 필드
	String name;
	String gearType; // 수동, 자동
	int door;
	// 엔진 필요
	private Engine engine = null;
	
	// 결합력이 높은 코딩이다 - > 나쁜 코딩이다. 
	// Engine engine = new Engine(); // 1) 명시적 초기화
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	{
		// 2) 인스턴스 초기화 블럭
		// this.engine = new Engine();
	}
	// 생성자
	Car(){
		// this.engine = new Engine(); // 3) 생성자 초기화
	}
	
	public Car(Engine engine) {
		this.engine = engine;
	}

	// 메서드
	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	void stop() {
		this.engine.stop();
	}
	

}
