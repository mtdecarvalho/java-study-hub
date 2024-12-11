package shape_entities;

import shape_enums.Color;

public class Circle extends AbstractShape {

	private Double radius;
	private final Double PI = 3.14;
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public Double area() {
		return PI * radius * radius;
	}
}
