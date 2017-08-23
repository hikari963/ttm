package demo.hakaze.ttm.beatmap;

public class Note implements NoteElement {
	private double measure;
	private int pos_start;
	private int pos_end;	
	private String type;
	
	public Note(double measure, int pos_start, int pos_end, String type) {		
		this.pos_start = pos_start;
		this.pos_end = pos_end;
		this.type = type;
	}	
	public int getPos_start() {
		return pos_start;
	}
	public int getPos_end() {
		return pos_end;
	}	
	public String getType() {
		return type;
	}
	public double getMeasure() {
		return measure;
	}

	public boolean isInRange(int pos){
		return pos < pos_end && pos > pos_start;
	}
	@Override
	public double getFirstMeasure() {
		return measure;
	}
	@Override
	public double getLastMeasure() {
		return measure;
	}
}
