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
