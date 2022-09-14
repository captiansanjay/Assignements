package ConstructorProg;

public class Box {
	int width;
	int height;
	int depth;

	public Box(int width, int height, int depth) {

		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	void display() {

		int volume = width * height * depth;
		System.out.println("volume=" + volume);
		
		
	}

}
