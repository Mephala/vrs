package vrs.model;

public class Rotation {

	private Double rx;
	private Double ry;
	private Double rz;
	private Double rw;

	public Rotation() {

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rw == null) ? 0 : rw.hashCode());
		result = prime * result + ((rx == null) ? 0 : rx.hashCode());
		result = prime * result + ((ry == null) ? 0 : ry.hashCode());
		result = prime * result + ((rz == null) ? 0 : rz.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Rotation [rx=" + rx + ", ry=" + ry + ", rz=" + rz + ", rw=" + rw + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rotation other = (Rotation) obj;
		if (rw == null) {
			if (other.rw != null)
				return false;
		} else if (!rw.equals(other.rw))
			return false;
		if (rx == null) {
			if (other.rx != null)
				return false;
		} else if (!rx.equals(other.rx))
			return false;
		if (ry == null) {
			if (other.ry != null)
				return false;
		} else if (!ry.equals(other.ry))
			return false;
		if (rz == null) {
			if (other.rz != null)
				return false;
		} else if (!rz.equals(other.rz))
			return false;
		return true;
	}

	public Double getRx() {
		return rx;
	}

	public void setRx(Double rx) {
		this.rx = rx;
	}

	public Double getRy() {
		return ry;
	}

	public void setRy(Double ry) {
		this.ry = ry;
	}

	public Double getRz() {
		return rz;
	}

	public void setRz(Double rz) {
		this.rz = rz;
	}

	public Double getRw() {
		return rw;
	}

	public void setRw(Double rw) {
		this.rw = rw;
	}

}
