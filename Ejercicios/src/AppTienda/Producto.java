package AppTienda;

public abstract class Producto {

	protected int stock;
	protected String descripcion;
	protected float precio;

	
	public Producto(int stock, String descripcion, float precio) {
		this.stock = stock;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
