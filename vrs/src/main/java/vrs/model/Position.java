package vrs.model;

public class Position {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((px == null) ? 0 : px.hashCode());
		result = prime * result + ((py == null) ? 0 : py.hashCode());
		result = prime * result + ((pz == null) ? 0 : pz.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (px == null) {
			if (other.px != null)
				return false;
		} else if (!px.equals(other.px))
			return false;
		if (py == null) {
			if (other.py != null)
				return false;
		} else if (!py.equals(other.py))
			return false;
		if (pz == null) {
			if (other.pz != null)
				return false;
		} else if (!pz.equals(other.pz))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Position [px=" + px + ", py=" + py + ", pz=" + pz + "]";
	}

	private Double px;
	private Double py;
	private Double pz;

	public Position() {

	}

	public Double getPx() {
		return px;
	}

	public void setPx(Double px) {
		this.px = px;
	}

	public Double getPy() {
		return py;
	}

	public void setPy(Double py) {
		this.py = py;
	}

	public Double getPz() {
		return pz;
	}

	public void setPz(Double pz) {
		this.pz = pz;
	}

}
