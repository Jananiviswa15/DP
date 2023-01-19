package Decorator;

public abstract class ShapeDecorator implements Shape {
	protected Shape decoratedShape;  //circle
	public ShapeDecorator(Shape decoratedShape){
		this.decoratedShape = decoratedShape;
	}
	public void draw(){
		decoratedShape.draw();
	}
}