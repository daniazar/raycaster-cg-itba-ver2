package primitives;


import javax.vecmath.Point3f;
import javax.vecmath.Vector3f;
import shader.Shader;
import rendering.Ray;

public abstract class Primitive implements Cloneable {
	
	public abstract boolean Intersects(Ray ray);
	
	public abstract void setShader(Shader s);

	public abstract Vector3f getNormal(Point3f point);
	
	public abstract Shader getShader();
	
}
