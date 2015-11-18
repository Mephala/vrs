package vrs.model;

public class VRView {

	private Double time;
	private String id;
	private Position pos;
	private Rotation rot;

	public VRView() {

	}

	public Double getTime() {
		return time;
	}

	@Override
	public String toString() {
		return "VRView [time=" + time + ", id=" + id + ", pos=" + pos + ", rot=" + rot + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pos == null) ? 0 : pos.hashCode());
		result = prime * result + ((rot == null) ? 0 : rot.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		VRView other = (VRView) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (pos == null) {
			if (other.pos != null)
				return false;
		} else if (!pos.equals(other.pos))
			return false;
		if (rot == null) {
			if (other.rot != null)
				return false;
		} else if (!rot.equals(other.rot))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	public void setTime(Double time) {
		this.time = time;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}

	public Rotation getRot() {
		return rot;
	}

	public void setRot(Rotation rot) {
		this.rot = rot;
	}

}
