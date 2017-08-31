public class  Cylinder  extends Circle{

	protected int height;
	
	public Cylinder(int r, int h){
		super(r);
		 height = h;
	}
	public void setHeight(int h){
		h = height;
	}
	public int getHeight(){
		return height;
	}
	public double getVolume(){
		return  Math.PI  * Math.pow(radius, 2) * height;
	}

}