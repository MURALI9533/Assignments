

public class Box {
	private Double length;
	private Double width;
	private Double height;
	private Double volume;
		
	public Box() {
		super();
	}
	
	public Box(Double length, Double width, Double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		this.calculateVolume();
	}
	public Double getLength() {
		return length;
	}
	public void setLength(Double length) {
		this.length = length;
	}
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getVolume() {
		return volume;
	}
	public void calculateVolume() {
		this.volume = this.height*this.width*this.length;
		this.volume = (double) Math.round(this.volume*100)/100;
	}
	
	
	
	@Override
	public int hashCode() {
		return this.volume.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}

	@Override
	public String toString() {
		return "Box [length=" + length + ", width=" + width + ", height=" + height + ", volume=" + volume + "]";
	}
	
	
	
	
}

